package cn.iwangxin.company.iflytek.T2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Player {
	String playerName;
	int playerScore;
	int playerGoal;
	int goal;
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int count = Integer.parseInt(sc.nextLine());
			Player[] players = new Player[count];
			Map<String, Player> playerMap = new HashMap<>();
			for (int i = 0; i < count; i++) {
				Player player = new Player();
				player.playerName = sc.nextLine();
				players[i] = player;
				playerMap.put(player.playerName, player);
			}
			int playCount = count * (count - 1) / 2;
			for (int i = 0; i < playCount; i++) {
				String play = sc.nextLine();
				String[] nameAndRes = play.split(" ");
				String name1 = nameAndRes[0].split("-")[0];
				String name2 = nameAndRes[0].split("-")[1];
				int score1 = Integer.parseInt(nameAndRes[1].split(":")[0]);
				int score2 = Integer.parseInt(nameAndRes[1].split(":")[1]);

				Player player1 = playerMap.get(name1);
				Player player2 = playerMap.get(name2);

				int diff = score1 - score2;
				player1.playerGoal += diff;
				player2.playerGoal -= diff;
				player1.goal += score1;
				player2.goal += score2;

				if (score1 > score2) {
					player1.playerScore = player1.playerScore + 3;
				} else if (score1 < score2) {
					player2.playerScore = player2.playerScore + 3;
				} else {
					player1.playerScore = player1.playerScore + 1;
					player2.playerScore = player2.playerScore + 1;
				}
			}

			Arrays.sort(players, new Comparator<Player>() {
				@Override
				public int compare(Player o1, Player o2) {
					if (o1.playerScore > o2.playerScore)
						return -1;
					else if (o1.playerScore < o2.playerScore)
						return 1;
					else {
						if (o1.playerGoal > o2.playerGoal)
							return -1;
						else if (o1.playerGoal < o2.playerGoal)
							return 1;
						else {
							if (o1.goal > o2.goal)
								return -1;
							else if (o1.goal < o2.goal)
								return 1;
							else
								return 0;
						}
					}
				}
			});

			Player[] copyPlayers = new Player[players.length / 2];
			System.arraycopy(players, 0, copyPlayers, 0, copyPlayers.length);
			Arrays.sort(copyPlayers, new Comparator<Player>() {

				@Override
				public int compare(Player o1, Player o2) {
					return o1.playerName.compareTo(o2.playerName);
				}
			});

			for (int i = 0; i < copyPlayers.length; i++)
				System.out.println(copyPlayers[i].playerName);
		}
		sc.close();
	}
}

