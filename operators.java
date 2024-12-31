class operators {
    public static void main(String[]args)
    {
           int yourSalary = 1000;
           int deduction = 500;
           //int monthlyTotal = yourSalary + deduction;
           int monthlyTotal = yourSalary - deduction;
           int yearlyTotal = yourSalary * deduction;
           int divide = yourSalary / deduction;
           int remainder = yourSalary % deduction;
           
           System.out.println(monthlyTotal);
           System.out.println(yearlyTotal);
           System.out.println(divide);
           System.out.println(remainder);
    }
}