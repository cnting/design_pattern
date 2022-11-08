package day_41_singleinstance

class KotlinInstance {

    companion object InnerSingleton {
        @JvmStatic
        fun foo() {
        }
    }
}

class User private constructor(name: String) {
    companion object {
        @JvmStatic
        fun create(name: String): User {
            return User(name)
        }
    }
}

/**
 * 1.借助懒加载委托
 */
object UserManager {
    val user by lazy { loadUser() }

    private fun loadUser(): User {
        return User.create("tom")
    }
}

/**
 * 2.伴生对象Double check
 */
class UserManager2 private constructor(name: String) {
    companion object {
        @Volatile
        private var INSTANCE: UserManager2? = null

        fun getInstance(name: String): UserManager2 = INSTANCE ?: synchronized(this) {
            INSTANCE ?: UserManager2(name).also { INSTANCE = it }
        }
    }
}

/**
 * 3.抽象类模板
 */
abstract class BaseSingleton<in P, out T> {
    @Volatile
    private var instance: T? = null

    protected abstract fun creator(param: P): T

    fun getInstance(param: P): T = instance ?: synchronized(this) {
        instance ?: creator(param).also { instance = it }
    }
}

class UserManager3 private constructor(name: String) {
    companion object : BaseSingleton<String, UserManager3>() {
        override fun creator(param: String): UserManager3 {
            return UserManager3(param)
        }
    }

    fun test() {
        //使用
        UserManager3.getInstance("ct")
    }
}
