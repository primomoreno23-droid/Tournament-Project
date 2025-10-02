public class temp_Team_Controller {
    //instance vars
    private Team[] teams;

    //constructor
    public temp_Team_Controller(){
//        String[] demoUserInput = {"A", "B", "C", "D"};
//        for(int i = 0; i < demoUserInput.length; i++){
//            Team x = new Team(demoUserInput[i]);
//            teams[i] = x;
//        }
        // testing teams class


            /*Team testerTeamB = teams[0];
            Team testerTeamA = teams[3];
            System.out.println(testerTeamA.getName());
            InputGameResult(testerTeamA,testerTeamB, 75,7);
            System.out.println(testerTeamA.getPointDifferential());
            System.out.println(testerTeamB.getPointDifferential());
            System.out.println(testerTeamA.getWinLossRecord() + "\n--");
            Team testerTeamC = teams[1];
            InputGameResult(testerTeamC,testerTeamB, 75,25);
            System.out.println(testerTeamB.getPointDifferential());
            System.out.println(testerTeamB.getWinLossRecord());*/
        // thorough team class testing complete

        // testing tournament class now
            Team testerTeamA = new Team("A", 3,1,20);
            Team testerTeamB = new Team("B", 0, 3, -12);
            Team testerTeamC = new Team("C", 1, 2, 47);
            Team testerTeamD = new Team("D", 2, 1, -33);
            Team testerTeamE = new Team("E", 3, 0, 68);
            Team testerTeamF = new Team("F", 0, 3, 5);
            Team testerTeamG = new Team("G", 1, 2, -71);
            Team testerTeamH = new Team("H", 2, 1, 14);
            Team testerTeamI = new Team("I", 3, 0, -44);
            Team testerTeamJ = new Team("J", 0, 3, 72);
            Team testerTeamK = new Team("K", 1, 2, -9);
            Team testerTeamL = new Team("L", 2, 1, 61);
            Team testerTeamM = new Team("M", 3, 0, -26);
            Team testerTeamN = new Team("N", 0, 3, 33);
            Team testerTeamO = new Team("O", 1, 2, -54);
            Team testerTeamP = new Team("P", 2, 1, 7);
            teams = new Team[]{testerTeamA, testerTeamB, testerTeamC, testerTeamD, testerTeamE, testerTeamF, testerTeamG, testerTeamH, testerTeamI, testerTeamJ, testerTeamK, testerTeamL, testerTeamM, testerTeamN, testerTeamO, testerTeamP};

            Tournament tournament = new Tournament(teams);
            System.out.println("round 1");
            tournament.createBracket();
            System.out.println("round 2");
            tournament.runRound(testerTeamA, testerTeamC, testerTeamE, testerTeamG, testerTeamI, team)

    }

    // how can I incorporate match class with this?
    public void InputGameResult(Team winningTeam, Team losingTeam,
                                       Integer winningTeamPoints, Integer losingTeamPoints){
        winningTeam.addWin();
        losingTeam.addLoss();
        winningTeam.addPointDifferential(winningTeamPoints - losingTeamPoints);
        losingTeam.addPointDifferential(losingTeamPoints - winningTeamPoints);
    }


}
