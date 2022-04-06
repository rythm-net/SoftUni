package moreExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TeamworkProjectsV1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number = Integer.parseInt(console.nextLine());
        List<TeamworkProjects.Team> teamList = new ArrayList<>();
        String input;

        for (int i = 0; i < number; i++) {
            input = console.nextLine();
            String[] attribute = input.split("-");
            String owner       = attribute[0];
            String name        = attribute[1];

            TeamworkProjects.Team haveTeam  = teamList.stream().filter
                    (s -> s.getName().equals(name)).findFirst().orElse(null);

            TeamworkProjects.Team haveOwner = teamList.stream().filter
                    (s -> s.getOwner().equals(owner)).findFirst().orElse(null);

            if (haveTeam == null && haveOwner == null) {
                TeamworkProjects.Team singleTeam = new TeamworkProjects.Team(name, owner);
                teamList.add(singleTeam);
                System.out.printf("Team %s has been created by %s!%n", name, owner);
            }
            if (haveTeam != null) {
                System.out.printf("Team %s was already created!%n", name);
            }
            if (haveOwner != null) {
                System.out.printf("%s cannot create another team!%n", owner);
            }
        }

        while (!"end of assignment".equals(input = console.nextLine())) {
            String[] attribute = input.split("->");
            String memberToAdd = attribute[0];
            String team        = attribute[1];

            TeamworkProjects.Team haveTeam   = teamList.stream().filter
                    (s -> s.getName().equals(team)).findFirst().orElse(null);
            TeamworkProjects.Team haveMember = teamList.stream().filter
                    (s -> s.getMembers().contains(memberToAdd) || s.getOwner().equals(memberToAdd)).findFirst().orElse(null);

            if (haveTeam == null) {
                System.out.printf("Team %s does not exist!%n", team);
            } else if (haveMember != null) {
                System.out.printf("Member %s cannot join team %s!%n", memberToAdd, team);
            } else {
                List<String> members = haveTeam.getMembers();
                members.add(memberToAdd);
                haveTeam.setMembers(members);
            }
        }
        teamList.stream().filter(s -> s.getMembers()
                .size() > 0)
                .sorted(Comparator.comparing(TeamworkProjects.Team::numberOfMembers)
                .reversed()
                .thenComparing(TeamworkProjects.Team::getName))
                .forEach(System.out::println);

        System.out.println("Teams to disband:");

        teamList.stream().filter(s -> s.getMembers()
                .size() == 0)
                .sorted(Comparator.comparing(TeamworkProjects.Team::getName))
                .forEach(s -> System.out.println(s.getName()));
    }

    public static class TeamworkProjects {
        static class Team {
            private String name;
            private String owner;
            private List <String> members;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getOwner() {
                return owner;
            }

            public void setOwner(String owner) {
                this.owner = owner;
            }

            public List<String> getMembers() {
                return members;
            }

            public void setMembers(List<String> members) {
                this.members = members;
            }

            public Team(String name, String owner) {
                this.name = name;
                this.owner = owner;
                this.members = new ArrayList<>();
            }

            public int numberOfMembers() {
                return members.size();
            }

            @Override
            public String toString() {
                List<String> sortedList = this.members.stream().sorted().collect(Collectors.toList());
                String printMembers = "";
                for (String member : sortedList) {
                    printMembers += String.format("%n-- %s", member);
                }
                return String.format("%s%n" +
                        "- %s" +
                        "%s", this.name, this.owner, printMembers);
            }
        }
    }
}