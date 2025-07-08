public class HaloEmployee {
    public static void main(String[] args)
    {
        EmployeOO employee1 = new EmployeOO("ucup", "manajer", 36, 15000000);
        System.out.println(employee1.getGaji());
        employee1.naikGaji(250000);
        System.out.println(employee1.getGaji());
        employee1.kenaPenalti(500000);
        System.out.println(employee1.getGaji());
        System.out.println(employee1.panggilEmployee());
    }
}
