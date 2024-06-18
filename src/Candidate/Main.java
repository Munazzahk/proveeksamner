package Candidate;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        ArrayList<Candidate> firstElection = new ArrayList<>();
        Candidate candidate1 = new Candidate("Anna", "SR", 30);
        Candidate candidate2 = new Candidate("Sara", "SR", 40);
        Candidate candidate3 = new Candidate("Lara", "MR", 20);

        firstElection.add(candidate1);
        firstElection.add(candidate2);
        firstElection.add(candidate3);

        Election election = new Election(firstElection);
        System.out.println(election.getTotalVotes());

        ArrayList<Candidate> candidatesFromSR = election.getCandidatesFromParty("SR");

        for (Candidate candidate : candidatesFromSR) {
            System.out.println(candidate.getName());
        }
     }
}
