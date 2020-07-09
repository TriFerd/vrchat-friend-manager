package model

import java.util.*

class Language(b47Code: String, val languageLevel: LanguageLevel) {
    val languageCode: LanguageCode
    val languageName: String
    init {
        this.languageCode = LanguageCode(b47Code)
        languageName = languageCode.languageName
    }


    class LanguageCode(val b47Code: String) {
        val languageName : String = Locale.forLanguageTag(b47Code).displayLanguage
    }

    enum class LanguageLevel {
        BASIC, INTERMEDIATE, ADVANCED, FLUENT
    }
}