/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;
import java.util.Scanner;

/**
 *
 * @author louis
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[20];
        int num,choice,del,update,new_elem,search,position;
        String again;
        
        System.out.print("Enter number of elements: ");
        num = input.nextInt();
        System.out.println();
        
        do{
        System.out.println("1.Add Element\n2.View All Element\n3.Delete Element\n4.Update Element\n5.Search Element");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        
        switch(choice){
            case 1:
                for(int i = 0; i<num; i++){
                    System.out.print("Enter element[" + i + "]:");
                    arr[i] = input.nextInt();
                }
                break;
            case 2:
                System.out.println("Array Elements:");
                for(int i = 0; i<num; i++){
                    System.out.print(arr[i] + "  ");
                }
                System.out.println();
                break;
            case 3:
                System.out.print("Enter Element position U want to remove: ");
                del = input.nextInt();
                while(del < num){
                for(int i = 0; i<num; i++){
                        arr[del - 1] = arr[del];
                        del = del + 1;
                    }
                }
                num = num - 1;
                System.out.println("Array Elements:");
                for(int i = 0; i<num; i++){
                    System.out.print(arr[i] + "  ");
                }
                System.out.println();
                break;
            case 4:
                System.out.print("Enter Element position U want to update: ");
                update = input.nextInt();
                System.out.print("Enter new Element: ");
                new_elem = input.nextInt();
                for(int i = 0; i<num; i++){
                    arr[update-1]=new_elem;
                }
                System.out.println("Array Elements:");
                for(int i = 0; i<num; i++){
                    System.out.print(arr[i] + "  ");
                }
                System.out.println();
                break;
            case 5:
                System.out.print("Enter element you want to search: ");
                search = input.nextInt();
                for(int i = 0; i<num; i++){
                    if(search == arr[i]){
                    position = i + 1;
                    System.out.println(search + " element is in position " + position);
                    }
                }
                break;
                
            default:
                System.out.println("Invalid Input");
                break;
        }
        System.out.print("Do u want to continue (y/n): ");
        again = input.next();
        
      
    }while(again.equalsIgnoreCase("y"));
        }
        
    }
    
    
