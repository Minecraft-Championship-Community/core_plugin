package mccc.core.local

import jetbrains.exodus.env.Environment
import jetbrains.exodus.env.Environments
import mccc.core.local.data.Games
import mccc.core.local.data.User


final class Repository {

    private var games: Environment = Environments.newInstance("/local/data/.Games")


}