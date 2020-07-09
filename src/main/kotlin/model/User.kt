package model

class User(var imagePath: String?, var userName: String, var lastUserName: String, var age: Int) {
    var languageList = mutableListOf<Language>()
    var aliasList  = mutableListOf<String>()
    public fun getImage(): String {
        // todo: use simpler syntax
        if (imagePath == null)
            return "https://cdn.pixabay.com/photo/2016/08/08/09/17/avatar-1577909_960_720.png"
        return imagePath as String;
    }
}

// todo: remove this
fun getDefaultUser(): User {
    val user = User(null, "<UserName>", "<OldUserName>", 20)
    user.languageList.add(Language("de-DE", Language.LanguageLevel.BASIC))
    user.languageList.add(Language("en-US", Language.LanguageLevel.FLUENT))

    user.aliasList.add("Alt-Name-1")
    user.aliasList.add("Alt-Name-2")
    return user
}

fun getDefaultUser(i: Int): User {
    return User(null, "<UserName-${i}>", "<OldUserName-${i}>", 18 + i)
}