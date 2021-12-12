package fr.umlv.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

// Pour mettre une chaine de caractères en majuscules, on utilise .toUpperCase(Locale.ROOT)
// List.replaceAll  utilise un unaryOperator  et renvoie void

public class Lambda<T> {
    public static void upperCaseAll(String[] strings){
        Arrays.asList(strings).replaceAll(s ->s.toUpperCase(Locale.ROOT));

    }

    public  HashMap<T, Integer> occurences(T[] value){
        var resultMap = new HashMap<T, Integer>();
        //List.of(string).forEach(s->resultMap.merge(s, 1, (old_value, new_value) -> old_value + new_value));
        List.of(value).forEach(s->resultMap.merge(s, 1, Integer::sum));
        return resultMap;
    }
}