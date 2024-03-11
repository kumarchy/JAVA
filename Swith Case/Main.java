import arop.BR;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;

class  fibonacci{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int empid=s.nextInt();
        String department=s.next();

//        switch (empid) {
//            case 1:
//                System.out.println("kumar chaudhary");
//                break;
//            case 2:
//                System.out.println("bibek chaudhary");
//                break;
//
//            case 3:
//                System.out.println("department");
//                switch (department){
//
//                    case  "IT":
//                        System.out.println("IT department");
//                        break;
//                    case  "management":
//                        System.out.println("management");
//                        break;
//                    case "science":
//                        System.out.println("science");
//                        break;
//                    default:
//                        System.out.println("no such a department");
//                        break;
//                }
//                break;
//            default:
//                System.out.println("enter the correct id");
//        }

//        ------Another way to use switch statemen----------
        switch (empid){
            case 1 -> System.out.println("kumar chaudhary");
            case 2-> System.out.println("bibek chaudhary");
            case 3->{
                switch (department){
                    case "IT"-> System.out.println("IT department");
                    case "management"-> System.out.println("management");
                    case "science"-> System.out.println("science");
                    default -> System.out.println("no department entered");
                }
            }
            default -> System.out.println("enter the correct id");
        }
    }
    }