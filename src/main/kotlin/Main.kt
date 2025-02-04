fun main(args: Array<String>) {
    var flag = 1

    val screen = MainScreen()
    do {
        screen.showMenu()
        if (MainScreen.isExit) flag = 0
    } while (flag == 1)
}