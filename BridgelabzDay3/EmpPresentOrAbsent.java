package com.BridgelabzDay3;

public class EmpPresentOrAbsent {

    private static int WAGE_PER_HR =20;
    private static int FULL_DAY_HR =8;
    private static int PART_TIME_HR =8;
    private static int WORK_DAY_MONTH =20;
    private static int TOTAL_WORK_HR = 100;

    public boolean isEmpPres() {
        boolean ifEmpPres = false;
        double random_num = Math.random();
        System.out.println(random_num);
        if (random_num > 0 && random_num <= 0.5) {
            ifEmpPres = false;
        } else if (random_num > 0.5 && random_num < 1) {
            ifEmpPres = true;
        }
        return ifEmpPres;
    }
    public int dailyWage()
    {
        int daily_wage = 0;
        if (isEmpPres()) {
            daily_wage = WAGE_PER_HR * FULL_DAY_HR;
        } else {
            daily_wage = 0;
        }
        return daily_wage;
    }
    public int dailyWage1()
    {
        int daily_wage = 0;
        if (isEmpPres()) {
            daily_wage = WAGE_PER_HR * PART_TIME_HR;
        } else {
            daily_wage = 0;
        }
        return daily_wage;
    }
    public int MonthWage()
    {
        int month_wage = 0;
        if (isEmpPres()) {
            month_wage = WAGE_PER_HR * FULL_DAY_HR * WORK_DAY_MONTH;
        } else {
            month_wage = 0;
        }
        return month_wage;
    }

    public int MonthWage2()
    {
        int month_wage = 0;
        if (isEmpPres()) {
            month_wage = TOTAL_WORK_HR * WORK_DAY_MONTH;
        } else {
            month_wage = 0;
        }
        return month_wage;
    }

    public static void main (String[]args){
        EmpPresentOrAbsent EmpPres = new EmpPresentOrAbsent();
        System.out.println("Today employee is present :" + EmpPres.isEmpPres());
        System.out.println("Today's wage is :" + EmpPres.dailyWage());
        System.out.println("Part time wage is:" + EmpPres.dailyWage1());
        System.out.println("Wages for month is :" + EmpPres.MonthWage());
        System.out.println("Total working hours or Days reached for month:" + EmpPres.MonthWage2());
    }
}

