package me.ddevil.rush.game

import com.voxelgameslib.voxelgameslib.game.AbstractGame
import com.voxelgameslib.voxelgameslib.game.GameMode

class RushGamemode : GameMode("Rush", RushGame::class.java)

class RushGame : AbstractGame() {
    override fun initGameFromModule() {

    }

}