package com.carriel.souleyman.Model.Garage;

import com.carriel.souleyman.Model.HomeShop.NoProductToBill;

public interface Writer2 {


        /**
         * commence à écrire
         */
        public void start ();

        /**
         *ajoute du text
         */
        public void writeLine (String line);

        /**
         *termine
         */
        public void stop ();

}
