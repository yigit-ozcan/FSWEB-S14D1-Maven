package com.workintech.developers;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[5];
        midDevelopers = new MidDeveloper[5];
        seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        setSalary(getSalary() + 500);
        System.out.println("HR Manager starts to working. New salary: " + getSalary());
    }

    public void addEmployee(JuniorDeveloper dev, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Invalid index!");
            return;
        }

        if (juniorDevelopers[index] != null) {
            System.out.println("Index already full! Junior not added.");
            return;
        }

        juniorDevelopers[index] = dev;
        System.out.println("Junior Developer added at index " + index);
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Invalid index!");
            return;
        }

        if(midDevelopers[index] != null) {
            System.out.println("Index already full! Mid not added");
            return;
        }

        midDevelopers[index] = dev;
        System.out.println("Mid Developer added at index " + index);
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Invalid index!");
            return;
        }

        if (seniorDevelopers[index] != null) {
            System.out.println("Index already full! Senior not added.");
            return;
        }

        seniorDevelopers[index] = dev;
        System.out.println("Senior Developer added at index " + index);
    }
}

