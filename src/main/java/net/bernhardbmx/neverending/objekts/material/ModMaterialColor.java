package net.bernhardbmx.neverending.objekts.material;

import com.google.common.base.Preconditions;

public class ModMaterialColor {
        private static final ModMaterialColor[] MOD_MATERIAL_COLORS = new ModMaterialColor[64];
        public static final ModMaterialColor NONE = new ModMaterialColor(0, 0);
        public static final ModMaterialColor RAW_STEEL = new ModMaterialColor(71, 8365974);
        public final int col;
        public final int id;

        private ModMaterialColor(int p_76425_, int p_76426_) {
            if (p_76425_ >= 0 && p_76425_ <= 63) {
                this.id = p_76425_;
                this.col = p_76426_;
                MOD_MATERIAL_COLORS[p_76425_] = this;
            } else {
                throw new IndexOutOfBoundsException("Map colour ID must be between 0 and 63 (inclusive)");
            }
        }

    public int calculateRGBColor(ModMaterialColor.Brightness p_192922_) {
            if (this == NONE) {
                return 0;
            } else {
                int i = p_192922_.modifier;
                int j = (this.col >> 16 & 255) * i / 255;
                int k = (this.col >> 8 & 255) * i / 255;
                int l = (this.col & 255) * i / 255;
                return -16777216 | l << 16 | k << 8 | j;
            }
        }

        public static ModMaterialColor byId(int p_192920_) {
            Preconditions.checkPositionIndex(p_192920_, MOD_MATERIAL_COLORS.length, "material id");
            return byIdUnsafe(p_192920_);
        }

        private static ModMaterialColor byIdUnsafe(int p_192928_) {
            ModMaterialColor materialcolor = MOD_MATERIAL_COLORS[p_192928_];
            return materialcolor != null ? materialcolor : NONE;
        }

        public static int getColorFromPackedId(int p_192924_) {
            int i = p_192924_ & 255;
            return byIdUnsafe(i >> 2).calculateRGBColor(ModMaterialColor.Brightness.byIdUnsafe(i & 3));
        }

        public byte getPackedId(ModMaterialColor.Brightness p_192926_) {
            return (byte)(this.id << 2 | p_192926_.id & 3);
        }

        public static enum Brightness {
            LOW(0, 180),
            NORMAL(1, 220),
            HIGH(2, 255),
            LOWEST(3, 135);

            private static final ModMaterialColor.Brightness[] VALUES = new ModMaterialColor.Brightness[]{LOW, NORMAL, HIGH, LOWEST};
            public final int id;
            public final int modifier;

            private Brightness(int p_192941_, int p_192942_) {
                this.id = p_192941_;
                this.modifier = p_192942_;
            }

            public static ModMaterialColor.Brightness byId(int p_192945_) {
                Preconditions.checkPositionIndex(p_192945_, VALUES.length, "brightness id");
                return byIdUnsafe(p_192945_);
            }

            static ModMaterialColor.Brightness byIdUnsafe(int p_192947_) {
                return VALUES[p_192947_];
            }
        }
}
