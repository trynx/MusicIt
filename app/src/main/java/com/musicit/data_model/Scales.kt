@file:Suppress("RemoveRedundantQualifierName")

package com.musicit.data_model

enum class Scales {
    // TODO - all gets change to =
    /* TODO - Change the "getScale" to something outside of the scales enum, to something that must be
      * called before using the scales (a type of factory)

     */
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> C
                ScalesType.Minor -> A
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> D
                ScalesType.Minor -> B
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> E
                ScalesType.Minor -> C_SHARP
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> F
                ScalesType.Minor -> D
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> G
                ScalesType.Minor -> E
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> A
                ScalesType.Minor -> F_SHARP
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> B
                ScalesType.Minor -> G_SHARP
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> C_SHARP
                ScalesType.Minor -> A_SHARP
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> D_SHARP
                ScalesType.Minor -> C
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> F_SHARP
                ScalesType.Minor -> D_SHARP
            }
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
        
        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> G_SHARP
                ScalesType.Minor -> F
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> A_SHARP
                ScalesType.Minor -> G
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> D_FLAT
                ScalesType.Minor -> C_SHARP.getScale(scaleType)
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> E_FLAT
                ScalesType.Minor -> D_SHARP.getScale(scaleType)
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> G_FLAT
                ScalesType.Minor -> F_SHARP.getScale(scaleType)
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> A_FLAT
                ScalesType.Minor -> G_SHARP.getScale(scaleType)
            }
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

        override fun getScale(scaleType: ScalesType): Scales {
            return when(scaleType){
                ScalesType.Major -> B_FLAT
                ScalesType.Minor -> A_SHARP.getScale(scaleType)
            }
        }
    };
    // endregion

    abstract fun getScaleName(): String
    abstract fun getScaleFingeringLeft(): String
    abstract fun getScaleFingeringRight(): String
    abstract fun getScale(scaleType: ScalesType): Scales
}
