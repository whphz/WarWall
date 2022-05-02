package com.whp.warwall.pojo;

import org.bukkit.entity.Player;

import java.util.List;

public class WallMatchInfo {
    private String uuid;//当前局的唯一id
    private List<Player> players;//当前对局中的玩家集合
    private String status;//当前对局状态

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
