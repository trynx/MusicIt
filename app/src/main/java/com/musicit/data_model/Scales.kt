package com.musicit.data_model

enum class Scales {
    // TODO - all gets change to =
    // region Whole Scales
    C {
        override fun getScaleName(): String {
            return "C"
        }

        override fun getScaleFingeringLeft(): String {
            return "5, 4, 3, 2, 1, 3, 2, 1"
        }

        override fun getScaleFingeringRight(): String {
            return "1, 2, 3, 1, 2, 3, 4, 5"
        }
    },
    D {
        override fun getScaleName(): String {
            return "D"
        }


        override fun getScaleFingeringLeft(): String {
            return "5, 4, 3, 2, 1, 3, 2, 1"
        }

        override fun getScaleFingeringRight(): String {
            return "1, 2, 3, 1, 2, 3, 4, 5"
        }
    },
    E {
        override fun getScaleName(): String {
            return "E"
        }


        override fun getScaleFingeringLeft(): String {
            return "5, 4, 3, 2, 1, 3, 2, 1"
        }

        override fun getScaleFingeringRight(): String {
            return "1, 2, 3, 1, 2, 3, 4, 5"
        }
    },
    F {
        override fun getScaleName(): String {
            return "F"
        }


        override fun getScaleFingeringLeft(): String {
            return "5, 4, 3, 2, 1, 3, 2, 1"
        }

        override fun getScaleFingeringRight(): String {
            return "1, 2, 3, 4, 1, 2, 3, 4"
        }
    },
    G {
        override fun getScaleName(): String {
            return "G"
        }


        override fun getScaleFingeringLeft(): String {
            return "5, 4, 3, 2, 1, 3, 2, 1"
        }

        override fun getScaleFingeringRight(): String {
            return "1, 2, 3, 1, 2, 3, 4, 5"
        }
    },
    A {
        override fun getScaleName(): String {
            return "A"
        }


        override fun getScaleFingeringLeft(): String {
            return "5, 4, 3, 2, 1, 3, 2, 1"
        }

        override fun getScaleFingeringRight(): String {
            return "1, 2, 3, 1, 2, 3, 4, 5"
        }
    },
    B {
        override fun getScaleName(): String {
            return "B"
        }


        override fun getScaleFingeringLeft(): String {
            return "4, 3, 2, 1, 4, 3, 2, 1"
        }

        override fun getScaleFingeringRight(): String {
            return "1, 2, 3, 1, 2, 3, 4, 5"
        }
    },

    // endregion

    // region Sharp Scales
    C_SHARP {
        override fun getScaleName(): String {
            return "C#"
        }


        override fun getScaleFingeringLeft(): String {
            return "3, 2, 1, 4, 3, 2, 1, 3"
        }

        override fun getScaleFingeringRight(): String {
            return "2, 3, 1, 2, 3, 4, 1, 2"
        }
    },
    D_SHARP {
        override fun getScaleName(): String {
            return "D#"
        }


        override fun getScaleFingeringLeft(): String {
            return "3, 2, 1, 4, 3, 2, 1, 3"
        }

        override fun getScaleFingeringRight(): String {
            return "3, 1, 2, 3, 4, 1, 2, 3"
        }
    },
    F_SHARP {
        override fun getScaleName(): String {
            return "F#"
        }


        override fun getScaleFingeringLeft(): String {
            return "4, 3, 2, 1, 3, 2, 1, 4"
        }

        override fun getScaleFingeringRight(): String {
            return "2, 3, 4, 1, 2, 3, 1, 2"
        }
    },
    G_SHARP {
        override fun getScaleName(): String {
            return "G#"
        }


        override fun getScaleFingeringLeft(): String {
            return "3, 2, 1, 4, 3, 2, 1, 3"
        }

        override fun getScaleFingeringRight(): String {
            return "3, 4, 1, 2, 3, 1, 2, 3"
        }
    },
    A_SHARP {
        override fun getScaleName(): String {
            return "A#"
        }


        override fun getScaleFingeringLeft(): String {
            return "3, 2, 1, 4, 3, 2, 1, 3"
        }

        override fun getScaleFingeringRight(): String {
            return "4, 1, 2, 3, 1, 2, 3, 4"
        }
    },
    // endregion

    // region Flat Scales
    D_FLAT {
        override fun getScaleName(): String {
            return "Db"
        }


        override fun getScaleFingeringLeft(): String {
            return C_SHARP.getScaleFingeringLeft()
        }

        override fun getScaleFingeringRight(): String {
            return C_SHARP.getScaleFingeringRight()

        }

    },
    E_FLAT {
        override fun getScaleName(): String {
            return "Eb"
        }

        override fun getScaleFingeringLeft(): String {
            return D_SHARP.getScaleFingeringLeft()
        }

        override fun getScaleFingeringRight(): String {
            return D_SHARP.getScaleFingeringRight()
        }
    },
    G_FLAT {
        override fun getScaleName(): String {
            return "Gb"
        }

        override fun getScaleFingeringLeft(): String {
            return F_SHARP.getScaleFingeringLeft()
        }

        override fun getScaleFingeringRight(): String {
            return F_SHARP.getScaleFingeringRight()
        }
    },
    A_FLAT {
        override fun getScaleName(): String {
            return "Ab"
        }

        override fun getScaleFingeringLeft(): String {
            return G_SHARP.getScaleFingeringLeft()
        }

        override fun getScaleFingeringRight(): String {
            return G_SHARP.getScaleFingeringRight()
        }
    },
    B_FLAT {
        override fun getScaleName(): String {
            return "Bb"
        }

        override fun getScaleFingeringLeft(): String {
            return A_SHARP.getScaleFingeringLeft()
        }

        override fun getScaleFingeringRight(): String {
            return A_SHARP.getScaleFingeringRight()
        }
    };
    // endregion

    abstract fun getScaleName(): String
    abstract fun getScaleFingeringLeft(): String
    abstract fun getScaleFingeringRight(): String
}
