package com.bnsantos.navigationdrawer;

import com.bnsantos.navigationdrawer.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by bruno on 30/01/15.
 */
public class Utils {
    public static final int[] FLAGS_DRAWABLES = new int[]{
            R.drawable.afghanistan, R.drawable.african_union, R.drawable.albania, R.drawable.algeria,
            R.drawable.american_amoa, R.drawable.andorra, R.drawable.anguilla, R.drawable.antarctica,
            R.drawable.antigua_barbuda, R.drawable.arab_league, R.drawable.argentina, R.drawable.armenia,
            R.drawable.aruba, R.drawable.asean, R.drawable.australia, R.drawable.azerbaijan,
            R.drawable.bahamas, R.drawable.bahrain, R.drawable.bangladesh, R.drawable.barbados,
            R.drawable.belarus, R.drawable.belize, R.drawable.bermuda, R.drawable.bhutan,
            R.drawable.bolivia, R.drawable.bosnia_and_herzegovina, R.drawable.brazil, R.drawable.brunei,
            R.drawable.bulgaria, R.drawable.burkina_faso, R.drawable.burundi, R.drawable.cambodja,
            R.drawable.cameroon, R.drawable.canada, R.drawable.cape_verde, R.drawable.caricom,
            R.drawable.cayman_islands, R.drawable.central_african_republic, R.drawable.chad, R.drawable.chile,
            R.drawable.china, R.drawable.cis, R.drawable.colombia, R.drawable.commonwealth,
            R.drawable.comoros, R.drawable.congo_brazzaville, R.drawable.congo_kinshasa_zaire, R.drawable.cook_islands,
            R.drawable.costa_rica, R.drawable.cote_divoire, R.drawable.croatia, R.drawable.cuba,
            R.drawable.cyprus, R.drawable.czech_republic, R.drawable.denmark, R.drawable.djibouti,
            R.drawable.dominica, R.drawable.dominican_republic, R.drawable.ecuador, R.drawable.egypt,
            R.drawable.el_salvador, R.drawable.england, R.drawable.equatorial_guinea, R.drawable.eritrea,
            R.drawable.estonia, R.drawable.ethiopia, R.drawable.european_union, R.drawable.faroes,
            R.drawable.fiji, R.drawable.finland, R.drawable.france, R.drawable.gabon,
            R.drawable.gambia, R.drawable.georgia, R.drawable.germany, R.drawable.ghana,
            R.drawable.gibraltar, R.drawable.greece, R.drawable.greenland, R.drawable.grenada,
            R.drawable.guadeloupe, R.drawable.guam, R.drawable.guatemala, R.drawable.guernsey,
            R.drawable.guinea, R.drawable.guinea_bissau, R.drawable.guyana, R.drawable.haiti,
            R.drawable.honduras, R.drawable.hong_kong, R.drawable.hungary, R.drawable.iceland,
            R.drawable.india, R.drawable.indonezia, R.drawable.iran, R.drawable.iraq,
            R.drawable.ireland, R.drawable.islamic_conference, R.drawable.isle_of_man, R.drawable.israel,
            R.drawable.italy, R.drawable.jamaica, R.drawable.japan, R.drawable.jersey,
            R.drawable.jordan, R.drawable.kazakhstan, R.drawable.kenya, R.drawable.kiribati,
            R.drawable.kosovo, R.drawable.kuwait, R.drawable.kyrgyzstan, R.drawable.laos,
            R.drawable.latvia, R.drawable.lebanon, R.drawable.lesotho, R.drawable.liberia,
            R.drawable.libya, R.drawable.liechtenshein, R.drawable.lithuania, R.drawable.luxembourg,
            R.drawable.macao, R.drawable.macedonia, R.drawable.madagascar, R.drawable.malawi,
            R.drawable.malaysia, R.drawable.maldives, R.drawable.mali, R.drawable.malta,
            R.drawable.marshall_islands, R.drawable.martinique, R.drawable.mauritania, R.drawable.mauritius,
            R.drawable.mexico, R.drawable.micronesia, R.drawable.moldova, R.drawable.monaco,
            R.drawable.mongolia, R.drawable.montenegro, R.drawable.montserrat, R.drawable.morocco,
            R.drawable.mozambique, R.drawable.myanmar_burma_, R.drawable.namibia, R.drawable.nato,
            R.drawable.nauru, R.drawable.nepal, R.drawable.netherlands, R.drawable.netherlands_antilles,
            R.drawable.new_caledonia, R.drawable.new_zealand, R.drawable.nicaragua, R.drawable.niger,
            R.drawable.north_korea, R.drawable.northern_cyprus, R.drawable.northern_ireland, R.drawable.norway,
            R.drawable.olimpic_movement, R.drawable.oman, R.drawable.opec, R.drawable.pakistan,
            R.drawable.palau, R.drawable.palestine, R.drawable.panama, R.drawable.papua_new_guinea,
            R.drawable.paraguay, R.drawable.peru, R.drawable.philippines, R.drawable.poland,
            R.drawable.portugal, R.drawable.puerto_rico, R.drawable.qatar, R.drawable.red_cross,
            R.drawable.reunion, R.drawable.romania, R.drawable.russian_federation, R.drawable.rwanda,
            R.drawable.saint_lucia, R.drawable.samoa, R.drawable.san_marino, R.drawable.sao_tome_and_principe,
            R.drawable.saudi_arabia, R.drawable.scotland, R.drawable.senegal, R.drawable.serbia_yugoslavia,
            R.drawable.seychelles, R.drawable.sierra_leone, R.drawable.singapore, R.drawable.slovakia,
            R.drawable.slovenia, R.drawable.solomon_islands, R.drawable.somalia, R.drawable.somaliland,
            R.drawable.south_africa, R.drawable.south_korea, R.drawable.spain, R.drawable.sri_lanka,
            R.drawable.st_kitts_and_nevis, R.drawable.st_vincent_and_the_grenadines, R.drawable.sudan, R.drawable.suriname,
            R.drawable.swaziland, R.drawable.sweden, R.drawable.switzerland, R.drawable.syria,
            R.drawable.tahiti_french_polinesia, R.drawable.taiwan, R.drawable.tajikistan, R.drawable.tanzania,
            R.drawable.thailand, R.drawable.timor_leste, R.drawable.togo, R.drawable.tonga,
            R.drawable.trinidad_and_tobago, R.drawable.tunisia, R.drawable.turkey, R.drawable.turkmenistan,
            R.drawable.turks_and_caicos_islands, R.drawable.tuvalu, R.drawable.uganda, R.drawable.ukraine,
            R.drawable.united_arab_emirates, R.drawable.united_kingdom_great_britain, R.drawable.united_nations, R.drawable.united_states_of_america,
            R.drawable.uruguay, R.drawable.uzbekistan, R.drawable.vanutau, R.drawable.vatican_city,
            R.drawable.venezuela, R.drawable.viet_nam, R.drawable.virgin_islands_british, R.drawable.virgin_islands_us,
            R.drawable.wales, R.drawable.western_sahara, R.drawable.yemen, R.drawable.zambia,
            R.drawable.zimbabwe
    };

    public static int[] getRandomDrawables(int lenght){
        int[] random = new int[lenght];
        for (int i=0;i<random.length;i++){
            random[i] = FLAGS_DRAWABLES[randInt(0, FLAGS_DRAWABLES.length-1)];
        }
        return random;
    }

    public static List<Item> generateRamdomItems(String[] countries){
        List<Item> itemList = new ArrayList<>();
        int maxItems = randInt(0, 15);
        while(maxItems>0){
            int drawables = randInt(1, 19);
            int contry = randInt(0, countries.length-1);
            itemList.add(new Item(countries[contry], getRandomDrawables(drawables)));
            maxItems--;
        }
        return itemList;
    }

    /**
     * Returns a pseudo-random number between min and max, inclusive.
     * The difference between min and max can be at most
     * <code>Integer.MAX_VALUE - 1</code>.
     *
     * @param min Minimum value
     * @param max Maximum value.  Must be greater than min.
     * @return Integer between min and max, inclusive.
     * @see java.util.Random#nextInt(int)
     */
    public static int randInt(int min, int max) {

        // NOTE: Usually this should be a field rather than a method
        // variable so that it is not re-seeded every call.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
}
