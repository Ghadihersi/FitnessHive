

package fitnesshive;

import java.util.Scanner;


public class Client extends User {
    private int age;
    private String gender;
    private double height;
    private double weight;  
    private int goal;
    private double BMI;
    private Subscribe sub=new Subscribe();
    private Schedule  Sch=new Schedule();
    Scanner input = new Scanner(System.in);
    
    public Client() {
        
    }
    
    

    public Client(int age, String gender, double height, double weight, int goal) {
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.goal = goal;
    }

   
     public Client(String name, int id, String phone, String email, String username, String password,int age, String gender, double height, double weight, int goal, double BMI){
        super(name,id,phone,email,username,password);    
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.goal=goal;
        this.BMI=BMI;
       
        
    }
    
     public void setGoal(int goal) {
         String fitnessGoal;
        switch (goal) {
            case 1:
                    fitnessGoal = "Lose weight";
                break;
            case 2:
                fitnessGoal ="Gain weight";
                break;
            case 3:
                fitnessGoal = "Enhance Physical Fitness";
                break;
            default:
                System.out.println("Invalid goal selection");
                break;
        }
        
    }
  

    public String getGoal(int goal) {
    switch (goal) {
        case 1:
            return "Lose weight";
        case 2:
            return "Gain weight";
        case 3:
            return "Enhance Physical Fitness";
        default:
            return "Invalid fitness goal";
    }
}
    
    
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBMI() {
        return BMI;
    }

    public double setBmi(double height,double weight ) {
        double heightMeters = height / 100;
        return weight / (heightMeters * heightMeters);
    } 
   

    //your methodes start here 
    public void makeSubscrption(){
       sub.setPkg2("6 Month, 500 SR");
       sub.setPkg3("1 Year, 900 SR");
        String ans1, ans2;
        int membership;
        
        System.out.println("Do you want to choose membership package?"+"\n please enter  YES to display membership list or pakages");

        ans1=input.next();
        
        if(ans1.equalsIgnoreCase("Yes")|| ans1.equalsIgnoreCase("yes")){
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Here is our membership list: ");
            System.out.println("1- "+sub.getPkg1()+"\n2- "+ sub.getPkg2()+"\n3- "+sub.getPkg3());
            System.out.println("Please enter the number of the membership:");
            membership=input.nextInt();
            System.out.println("-----------------------------------------------------------------------");
             
                if(membership == 1){
                    System.out.println("The plan you choose is  package 1"+"\n"+sub.getPkg1());          
                    int i = 300;
                    System.out.println("Total amount: " + i);
                    System.out.println("Enter the discount code: " );
                    String discount = input.next();
                    Payment.Discount(i, discount);
                     System.out.println("Thank you so much for choose Fitness Hive! \n Please enter OK to complete subscription:");
                     ans2=input.next();
                     System.out.println("-----------------------------------------------------------------------");
                     
                     
                    if(ans2.equalsIgnoreCase("ok")){
                        sub.printSubscrbtionInfo(sub.getPkg1());
                    }
                } else if (membership== 2) {
                    System.out.println("The plan you choose is package 2 " +"\n"+sub.getPkg2());
                    int i = 500;
                    System.out.println("Total amount: " + i);
                    System.out.println("Enter the discount code: " );
                    String discount = input.next();
                    Payment.Discount(i, discount);
                    System.out.println("Thank you so much for choose Fitness Hive! \n Please enter OK to complete subscription:");    
                    ans2=input.next();
                    System.out.println("-----------------------------------------------------------------------");
                    
                    
                    if(ans2.equalsIgnoreCase("ok"))  
                   sub.printSubscrbtionInfo(sub.getPkg2());
                    
                } else if (membership == 3) {
                    System.out.println("The plan you choose is  package 3"+"\n"+sub.getPkg3());
                    int i = 900;
                    System.out.println("Total amount: " + i);
                    System.out.println("Enter the discount code: " );
                    String discount = input.next();
                    Payment.Discount(i, discount);
                    System.out.println("Thank you so much for choosing Fitness Hive! \n Please enter OK to complete subscription:");
                    ans2=input.next();
                    sub.printSubscrbtionInfo(sub.getPkg3());
                     System.out.println("-----------------------------------------------------------------------");
                }
                
                

        }else{
             System.out.println("Error! Wrong entry");
             System.exit(0);
        } 
          
        
        
        
        
        
    }
       
  
        public void choose_schedule(){
            
       System.out.println("if you want to choose schedule enter yes: ");
       String choose= input.next();
       if(choose.equalsIgnoreCase("yes")|| choose.equalsIgnoreCase("YES")){
        System.out.println("-----------------------------------------------------------------------");
       System.out.println("1.Osama Alhazmi \n2.Fatmah Alghamdi \n3.khalid Alsolami\n4.Nora Alzahrani\n5.Fay Mohammad");
       System.out.println("enter the trainer number");
       
       int n=input.nextInt();
              
      Sch.available_plans();
       switch(n){
           
           case 1:
               System.out.println("-----------------------------------------------------------------------");
               System.out.println("enter the desired plan:");
               String t1=input.next();
                System.out.println("Your Schedule is:");
               if(t1.equalsIgnoreCase("a")){
                   Sch.planA();
                   
                   
               }else if(t1.equalsIgnoreCase("b")){
                 Sch.planB(); 
               }else if(t1.equalsIgnoreCase("c")){
                  Sch.planC(); 
               }
               break;
       
           case 2:
                System.out.println("-----------------------------------------------------------------------");
               System.out.println("enter the desired plan:");
               String t2=input.next();
                System.out.println("Your Schedule is:");
               if(t2.equalsIgnoreCase("a")){
                   Sch.planA();
                   
               }else if(t2.equalsIgnoreCase("b")){
                  Sch.planB(); 
               }else if(t2.equalsIgnoreCase("c")){
                  Sch.planC(); 
               }
               break;
                 
           case 3: 
               System.out.println("-----------------------------------------------------------------------");
               System.out.println("enter the desired plan:");
               String t3=input.next();
                System.out.println("Your Schedule is:");
               if(t3.equalsIgnoreCase("a")){
                   Sch.planA();
                   
               }else if(t3.equalsIgnoreCase("b")){
                  Sch.planB(); 
               }else if(t3.equalsIgnoreCase("c")){
                  Sch.planC(); 
               }
               break;
               
           case 4:  
                System.out.println("-----------------------------------------------------------------------");
               System.out.println("enter the desired plan:");
               String t4=input.next();
               System.out.println("Your Schedule is:");
               if(t4.equalsIgnoreCase("a")){
                   Sch.planA();
                   
               }else if(t4.equalsIgnoreCase("b")){
                  Sch.planB(); 
               }else if(t4.equalsIgnoreCase("c")){
                  Sch.planC(); 
               }
               break;
               
           case 5:    
               System.out.println("-----------------------------------------------------------------------");
               System.out.println("enter the desired plan:");
               String t5=input.next();
                System.out.println("Your Schedule is:");
               if(t5.equalsIgnoreCase("a")){
                   Sch.planA();
                   
               }else if(t5.equalsIgnoreCase("b")){
                  Sch.planB(); 
               }else if(t5.equalsIgnoreCase("c")){
                  Sch.planC(); 
               }
                System.out.println("-----------------------------------------------------------------------");
               break;
           default:
          System.out.println("Error! Wrong entry");
  
       }     
       }
       else{
             System.out.println("Error! Wrong entry");
             System.exit(0);
       }
   }

       
}   

