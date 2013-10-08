package game;

import java.util.Set;

public class TournamentExample {

    /**
     * Entrant represents a competitor in some game.
     */
    public class Entrant {
        protected int skill;
        protected String name;
        
        public Entrant(int skill, String name) {
            this.skill = skill;
            this.name = name;
        }
        
        /**
         * @return the skill of the entrant; higher is better.
         */
        public int skill() {
            return skill;
        }
        
        /**
         * @return the name of the entrant.
         */
        public String name() {
            return name;
        }
        
        @Override
        public boolean equals(Object other) {
            // TODO fill in
        }
        
        @Override
        public int hashCode() {
            // TODO fill in
        }
    }
    
    /**
     * Team represents a competitor in some game consisting of many players.
     */
    public class Team extends Entrant {       
        private Set<String> playerNames;
        
        public Team(int skill, String name, Set<String> playerNames) {
            super(skill, name);
            this.playerNames = playerNames;
        }
        
        /**
         * @return the names of the players on the team.
         */
        public Set<String> getPlayerNames() {
            return playerNames;
        }
        
        @Override
        public boolean equals(Object other) {
            // TODO fill in
        }
        
        @Override
        public int hashCode() {
            // TODO fill in
        }
    }
    
    /**
     * Tournament represents a single elimination tournament.
     */
    public interface Tournament {
        /**
         * @return the winner of the tournament -- an entrant whose skill is greater than or equal
         * to all the other entrants in the tournament.
         */
        public Entrant winner();
        
        /**
         * @return the set of entrants that participated in the tournament.
         */
        public Set<Entrant> entrants();
    }
    
    /**
     * Bye represents a leaf node in the tournament tree -- a game with only one
     * entrant.
     */
    public static class Bye implements Tournament {
        
        private final Entrant entrant;
        
        public Bye(Entrant entrant) {
            this.entrant = entrant;
        }
        
        @Override
        public Entrant winner() {
            // TODO fill in
        }

        @Override
        public Set<Entrant> entrants() {
            // TODO fill in
        }
        
        @Override
        public boolean equals(Object other) {
            // TODO fill in
        }
        
        @Override
        public int hashCode() {
            // TODO fill in
        }
    }
    
    /**
     * Game represents a single game in a tournament, along with the games
     * contained in its subtree in the tournament.
     */
    public static class Game implements Tournament {
        
        private final Tournament t1, t2;
        
        public Game(Tournament t1, Tournament t2) {
            this.t1 = t1;
            this.t2 = t2;
        }
        
        @Override
        public Entrant winner() {
            // TODO fill in
        }

        @Override
        public Set<Entrant> entrants() {
            // TODO fill in
        }
        
        @Override
        public boolean equals(Object other) {
            // TODO fill in
        }
        
        @Override
        public int hashCode() {
            // TODO fill in
        }
    }
}