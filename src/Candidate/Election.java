package Candidate;

import java.util.ArrayList;

public class Election {
    private ArrayList<Candidate> allCandidates;

    public Election(ArrayList<Candidate> allCandidates) {
        this.allCandidates = allCandidates;
    }

    public int getTotalVotes() {
        int totalVotes = 0;
        for (Candidate candidate : allCandidates) {
            totalVotes += candidate.getNumberOfVotes();
        }
        return totalVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party) {
        ArrayList<Candidate> candidatesFromParty = new ArrayList<>();
        for (Candidate candidate : allCandidates) {
            if (candidate.getParty().equals(party)) {
                candidatesFromParty.add(candidate);
            }
        }
        return candidatesFromParty;
    }
}
