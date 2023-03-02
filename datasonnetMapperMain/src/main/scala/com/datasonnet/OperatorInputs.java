package com.datasonnet;

public class OperatorInputs {
    /*//Sample DW code
        //[{ letter: "e" }, { letter: "d" }] orderBy ($.letter)
        //orderDescending: ([3,8,1] orderBy -$)
        //payload orderBy (person) -> person.age  //Just for reference

        String operation = "[{name: \"Leandro\", age: 29}, {name: \"Mariano\", age: 42},{name: \"Antiago\", age: 33}] " +
                "orderBy $.age";
        //String operation = "[3,8,1] orderBy $";
        String pay="",fn="",field="";

        if(operation.contains("orderBy"))
        {
            int len = operation.length();
            int index = operation.indexOf("orderBy");
            pay = operation.substring(0,index);  // 0 to (index-1)
            fn = "orderBy";
            field = operation.substring(index, len).replace("orderBy","");

            //System.out.println(pay);
            //System.out.println(fn);
            //System.out.println(field);       // Print stmts
        }
        String Script2Run = Operatorss.orderByD$(pay,fn,field);
        */  // OrderBy Main Code

    /*// Sample DW
      // { a: ceil 1.5 }
    String operation = " abs -2.25 ";                   // Change opr to ceil/abs/floor/sqrt
        String pay="", fn="",field="";
        operation=operation.trim();
        System.out.println(operation);
        String opr = "abs";                             // Change opr to ceil/abs/floor/sqrt
        if(operation.contains(opr)) {
            int len = operation.length();
            int index = operation.indexOf(opr);
            pay = operation.substring(0, index);        // 0 to (index-1)
            fn = opr;
            field = operation.substring(index, len).replace(opr, "").trim();
        }
        // Change below function to call ceil/abs/floor/sqrt
        String Script2Run = Operatorss.abs(Double.parseDouble(field));*/  // ceil/abs/floor/sqrt


}


