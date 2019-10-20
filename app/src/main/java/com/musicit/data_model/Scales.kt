package com.musicit.data_model

enum class Scales {
    // region Whole Scales
    C {
        override fun getScaleName(): String {
            return "C"
        }
    },
    D {
        override fun getScaleName(): String {
            return "D"
        }
    },
    E {
        override fun getScaleName(): String {
            return "E"
        }
    },
    F {
        override fun getScaleName(): String {
            return "F"
        }
    },
    G {
        override fun getScaleName(): String {
            return "G"
        }
    },
    A {
        override fun getScaleName(): String {
            return "A"
        }
    },
    B {
        override fun getScaleName(): String {
            return "B"
        }
    },

    // endregion

    // region Sharp Scales
    C_SHARP {
        override fun getScaleName(): String {
            return "C#"
        }
    },
    D_SHARP {
        override fun getScaleName(): String {
            return "D#"
        }
    },
    F_SHARP {
        override fun getScaleName(): String {
            return "F#"
        }
    },
    G_SHARP {
        override fun getScaleName(): String {
            return "G#"
        }
    },
    A_SHARP {
        override fun getScaleName(): String {
            return "A#"
        }
    },
    // endregion

    // region Flat Scales
    D_FLAT {
        override fun getScaleName(): String {
            return "Db"
        }
    },
    E_FLAT {
        override fun getScaleName(): String {
            return "Eb"
        }
    },
    G_FLAT {
        override fun getScaleName(): String {
            return "Gb"
        }
    },
    A_FLAT {
        override fun getScaleName(): String {
            return "Ab"
        }
    },
    B_FLAT {
        override fun getScaleName(): String {
            return "Bb"
        }
    };
    // endregion

    abstract fun getScaleName(): String
}
