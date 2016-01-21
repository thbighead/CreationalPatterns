package main;

import java.util.Scanner;

import prototypeExample.AerobicBacteria;
import prototypeExample.AnaerobicBacteria;
import factoryExample.AtomFactory;
import abstractFactoryExample.Molecule;
import abstractFactoryExample.MoleculeFactory;
import builderExample.Element;
import builderExample.ElementBuilder;
import builderExample.HydrogenElementBuilder;
import builderExample.OxygenElementBuilder;
import builderExample.PeriodicTable;
import singletonExample.Universe;


public class God {
    private static Universe universe;

    public static void main(String[] args) {
        // big-banging my sand-box-universe
        universe = Universe.getInstance();
        showGospel("At the beginning, there was nothing...");

        // God takes His periodic table
        PeriodicTable periodicTable = new PeriodicTable();
        // God's ordering an hydrogen from His periodic table
        ElementBuilder hydrogen_elementbuilder = new HydrogenElementBuilder();

        periodicTable.setElementBuilder(hydrogen_elementbuilder);
        periodicTable.constructElement();

        Element hydrogen = periodicTable.getElement();

        // God's ordering an oxygen from His periodic table
        ElementBuilder oxygen_elementbuilder = new OxygenElementBuilder();

        periodicTable.setElementBuilder(oxygen_elementbuilder);
        periodicTable.constructElement();

        Element oxygen = periodicTable.getElement();

        // Now God is going to turn on His "Factory of Atoms" to construct atoms into His Universe
        AtomFactory atomFactory = new AtomFactory();
        universe.put(hydrogen.getName(), atomFactory.makeAtom(hydrogen));
        universe.put(oxygen.getName(), atomFactory.makeAtom(oxygen));
        showGospel("Then God created some atoms...");

        // Now God is going to turn on His molecule factory...
        MoleculeFactory moleculeFactory;
        // And ask it to construct water...
        moleculeFactory = MoleculeFactory.getFactory(MoleculeFactory.H20);
        Molecule water = moleculeFactory.createMolecule(universe);
        universe.put(water.name, water);
        showGospel("And with them, He made water...");
        // ... and air
        moleculeFactory = MoleculeFactory.getFactory(MoleculeFactory.O2);
        Molecule air = moleculeFactory.createMolecule(universe);
        universe.put(air.name, air);
        showGospel("... and air");

        // It's time for God to create life!
        universe.put("Clostridium_tetani", new AnaerobicBacteria());
        universe.put("Escherichia_coli", new AerobicBacteria());
        showGospel("At this point, God created two lifebeings to live and prosper in this new beautiful world!");

        life();
        showGospel("But only one of them was able to live and to reproduce itself...");

        universe.remove("air");
        showGospel("God understood that Clostridium tetani couldn't survive if air exists and wiped out all the air of universe");

        life();
        showGospel("But now Escherichia coli couldn't survive, and God realized how life was complex..");
    }

    private static void life() {
        AnaerobicBacteria clostridiumTetani =
                (AnaerobicBacteria) universe.get("Clostridium_tetani");
        AerobicBacteria escherichiaColi = (AerobicBacteria) universe.get("Escherichia_coli");

        for (int i = 1; i <= 3; i++) {
            if (clostridiumTetani.live(universe)) {
                universe.put("Clostridium_tetani_" + i, clostridiumTetani.clone());
            } else {
                universe.remove("Clostridium_tetani_" + i);
            }

            if (escherichiaColi.live(universe)) {
                universe.put("Escherichia_coli_" + i, escherichiaColi.clone());
            } else {
                universe.remove("Escherichia_coli_" + i);
            }
        }
    }

    private static void showGospel(String message) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);
        System.out.println(universe.toString());
        scanner.nextLine();
    }
}
