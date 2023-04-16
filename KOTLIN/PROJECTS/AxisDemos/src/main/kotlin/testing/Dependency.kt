class Dependency {

    fun calculateResult() = 42

}

class Subject(dependency: Dependency) {

    val result = dependency.calculateResult()

}
