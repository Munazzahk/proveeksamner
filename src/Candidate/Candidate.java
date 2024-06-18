package Candidate;

public class Candidate {
    private String name;
    private String party;
    private int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes) {
        this.name = name;
        this.numberOfVotes = numberOfVotes;
        this.party = party;
    }

    public String getParty() {
        return party;
    }

    public int getNumberOfVotes() {
        return numberOfVotes;
    }

    public String getName() {
        return name;
    }
}
