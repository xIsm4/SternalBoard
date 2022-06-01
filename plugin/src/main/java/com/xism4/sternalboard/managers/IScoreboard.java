package com.xism4.sternalboard.managers;

import com.xism4.sternalboard.SternalBoard;
import org.bukkit.entity.Player;

public interface IScoreboard {

    void run();
    void setScoreboard(Player player);
    void removeScoreboard(Player player);
    void reloadScoreboard();
    void updateScoreboard(SternalBoard board);
    void toggleScoreboard(Player player);

}
