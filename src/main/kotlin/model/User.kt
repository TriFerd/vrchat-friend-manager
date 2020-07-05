package model

class User(var imagePath: String?, var userName: String, var lastUserName: String) {

    public fun getImage(): String {
        // todo: use simpler syntax
        if (imagePath == null)
            return "https://cdn.pixabay.com/photo/2016/08/08/09/17/avatar-1577909_960_720.png"
        return imagePath as String;
    }
}

// todo: remove this
fun getDefaultUser(): User {
    return User(null, "<UserName>", "<OldUserName>")
}

fun getDefaultUser(i: Int): User {
    return User(null, "<UserName-${i}>", "<OldUserName-${i}>")
}