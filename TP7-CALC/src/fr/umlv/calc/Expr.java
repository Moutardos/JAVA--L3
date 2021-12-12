package fr.umlv.calc;

import java.util.Iterator;
import java.util.Objects;

sealed public interface Expr{

    sealed interface BinOp extends Expr {
        Expr lvalue();
        Expr rvalue();


        default int eval(){
            return switch(this.getClass().toString()){
                case "class fr.umlv.calc.Expr$BinOp$Add" -> lvalue().eval() + rvalue().eval();
                case "class fr.umlv.calc.Expr$BinOp$Mul" -> lvalue().eval() * rvalue().eval();
                case "class fr.umlv.calc.Expr$BinOp$Sub" -> lvalue().eval() - rvalue().eval();
                default -> throw new AssertionError("I don't know how you managed to get there");

            };
        }

        record Mul(Expr lvalue, Expr rvalue) implements BinOp{
            public Mul {
                Objects.requireNonNull(lvalue);
                Objects.requireNonNull(rvalue);
            }

        }
        record Sub(Expr lvalue, Expr rvalue) implements  BinOp {
            public Sub {
                Objects.requireNonNull(lvalue);
                Objects.requireNonNull(rvalue);
            }
        }

        record Add(Expr lvalue, Expr rvalue) implements  BinOp {
            public Add {
                Objects.requireNonNull(lvalue);
                Objects.requireNonNull(rvalue);
            }
        }

    }

    default int eval(){
        return 0;
    }
    record Value(int nbr) implements Expr {
        @Override
        public int eval() {
            return nbr;
        }
    }



    static Expr parse(Iterator iterator){
        if (iterator.hasNext()) {
            var el = iterator.next();

            // On renvoie l'element en int, si cela ne fonctionne pas alors l'element est un operateur
            try {
                return new Value(Integer.parseInt((String) el));
            } catch (NumberFormatException ignored) {
            }

            return switch ((String) el) {
                case "+" -> new BinOp.Add(parse(iterator), parse(iterator));
                case "-" -> new BinOp.Sub(parse(iterator), parse(iterator));
                case "*" -> new BinOp.Mul(parse(iterator), parse(iterator));
                default -> throw new IllegalArgumentException("Wrong operator, only +-/* allowed");
            };
        }
        throw new IllegalArgumentException("Scanner seems to be empty");
    }
}





