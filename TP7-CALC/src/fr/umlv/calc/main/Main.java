package fr.umlv.calc.main;

import fr.umlv.calc.Expr;
import fr.umlv.calc.Expr.*;
import java.util.Scanner;
import fr.umlv.calc.Expr.BinOp.*;


public class Main {


    public static void main(String[] args){


        Expr expression = new Add(new Value(2), new Value(3));
        Expr expression2 = new Sub(new Add(new Value(2), new Value(3)), new Value(4));

        Scanner scan = new Scanner("- + 2 3 4");
        Expr expression3 = Expr.parse(scan);
        System.out.println(expression3.eval());


    }
}
