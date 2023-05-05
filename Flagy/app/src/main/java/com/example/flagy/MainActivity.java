package com.example.flagy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Color;

import android.os.Bundle;

import java.util.Timer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;


public class MainActivity extends AppCompatActivity {



    private Map<String, String> countries = new HashMap<>();
    private Map<String,Integer> countryDrawables = new HashMap<>();


    private  int collectionNumber=1;
    private  int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        countries.put("AF", "Afghanistan");
        countries.put("AX", "Aland Islands");
        countries.put("AL", "Albania");
        countries.put("DZ", "Algeria");
        countries.put("AS", "American Samoa");
        countries.put("AD", "Andorra");
        countries.put("AO", "Angola");
        countries.put("AI", "Anguilla");
        countries.put("AQ", "Antarctica");
        countries.put("AG", "Antigua And Barbuda");
        countries.put("AR", "Argentina");
        countries.put("AM", "Armenia");
        countries.put("AW", "Aruba");
        countries.put("AU", "Australia");
        countries.put("AT", "Austria");
        countries.put("AZ", "Azerbaijan");
        countries.put("BS", "Bahamas");
        countries.put("BH", "Bahrain");
        countries.put("BD", "Bangladesh");
        countries.put("BB", "Barbados");
        countries.put("BY", "Belarus");
        countries.put("BE", "Belgium");
        countries.put("BZ", "Belize");
        countries.put("BJ", "Benin");
        countries.put("BM", "Bermuda");
        countries.put("BT", "Bhutan");
        countries.put("BO", "Bolivia");
        countries.put("BA", "Bosnia And Herzegovina");
        countries.put("BW", "Botswana");
        countries.put("BV", "Bouvet Island");
        countries.put("BR", "Brazil");
        countries.put("IO", "British Indian Ocean Territory");
        countries.put("BN", "Brunei Darussalam");
        countries.put("BG", "Bulgaria");
        countries.put("BF", "Burkina Faso");
        countries.put("BI", "Burundi");
        countries.put("KH", "Cambodia");
        countries.put("CM", "Cameroon");
        countries.put("CA", "Canada");
        countries.put("CV", "Cape Verde");
        countries.put("KY", "Cayman Islands");
        countries.put("CF", "Central African Republic");
        countries.put("TD", "Chad");
        countries.put("CL", "Chile");
        countries.put("CN", "China");
        countries.put("CX", "Christmas Island");
        countries.put("CC", "Cocos (Keeling) Islands");
        countries.put("CO", "Colombia");
        countries.put("KM", "Comoros");
        countries.put("CG", "Congo");
        countries.put("CD", "Congo, Democratic Republic");
        countries.put("CK", "Cook Islands");
        countries.put("CR", "Costa Rica");
        countries.put("CI", "Cote D'Ivoire");
        countries.put("HR", "Croatia");
        countries.put("CU", "Cuba");
        countries.put("CY", "Cyprus");
        countries.put("CZ", "Czech Republic");
        countries.put("DK", "Denmark");
        countries.put("DJ", "Djibouti");
        countries.put("DM", "Dominica");
        countries.put("EC", "Ecuador");
        countries.put("EG", "Egypt");
        countries.put("SV", "El Salvador");
        countries.put("GQ", "Equatorial Guinea");
        countries.put("ER", "Eritrea");
        countries.put("EE", "Estonia");
        countries.put("ET", "Ethiopia");
        countries.put("FK", "Falkland Islands (Malvinas)");
        countries.put("FO", "Faroe Islands");
        countries.put("FJ", "Fiji");
        countries.put("FI", "Finland");
        countries.put("FR", "France");
        countries.put("GF", "French Guiana");
        countries.put("PF", "French Polynesia");
        countries.put("TF", "French Southern Territories");
        countries.put("GA", "Gabon");
        countries.put("GM", "Gambia");
        countries.put("GE", "Georgia");
        countries.put("DE", "Germany");
        countries.put("GH", "Ghana");
        countries.put("GI", "Gibraltar");
        countries.put("GR", "Greece");
        countries.put("GL", "Greenland");
        countries.put("GD", "Grenada");
        countries.put("GP", "Guadeloupe");
        countries.put("GU", "Guam");
        countries.put("GT", "Guatemala");
        countries.put("GG", "Guernsey");
        countries.put("GN", "Guinea");
        countries.put("GW", "Guinea-Bissau");
        countries.put("GY", "Guyana");
        countries.put("HT", "Haiti");
        countries.put("HM", "Heard Island & Mcdonald Islands");
        countries.put("VA", "Holy See (Vatican City State)");
        countries.put("HN", "Honduras");
        countries.put("HK", "Hong Kong");
        countries.put("HU", "Hungary");
        countries.put("IS", "Iceland");
        countries.put("IN", "India");
        countries.put("ID", "Indonesia");
        countries.put("IR", "Iran, Islamic Republic Of");
        countries.put("IQ", "Iraq");
        countries.put("IE", "Ireland");
        countries.put("IM", "Isle Of Man");
        countries.put("IT", "Italy");
        countries.put("JM", "Jamaica");
        countries.put("JP", "Japan");
        countries.put("JE", "Jersey");
        countries.put("JO", "Jordan");
        countries.put("KZ", "Kazakhstan");
        countries.put("KE", "Kenya");
        countries.put("KI", "Kiribati");
        countries.put("KR", "Korea");
        countries.put("KW", "Kuwait");
        countries.put("KG", "Kyrgyzstan");
        countries.put("LA", "Lao People's Democratic Republic");
        countries.put("LV", "Latvia");
        countries.put("LB", "Lebanon");
        countries.put("LS", "Lesotho");
        countries.put("LR", "Liberia");
        countries.put("LY", "Libyan Arab Jamahiriya");
        countries.put("LI", "Liechtenstein");
        countries.put("LT", "Lithuania");
        countries.put("LU", "Luxembourg");
        countries.put("MO", "Macao");
        countries.put("MK", "Macedonia");
        countries.put("MG", "Madagascar");
        countries.put("MW", "Malawi");
        countries.put("MY", "Malaysia");
        countries.put("MV", "Maldives");
        countries.put("ML", "Mali");
        countries.put("MT", "Malta");
        countries.put("MH", "Marshall Islands");
        countries.put("MQ", "Martinique");
        countries.put("MR", "Mauritania");
        countries.put("MU", "Mauritius");
        countries.put("YT", "Mayotte");
        countries.put("MX", "Mexico");
        countries.put("FM", "Micronesia, Federated States Of");
        countries.put("MD", "Moldova");
        countries.put("MC", "Monaco");
        countries.put("MN", "Mongolia");
        countries.put("ME", "Montenegro");
        countries.put("MS", "Montserrat");
        countries.put("MA", "Morocco");
        countries.put("MZ", "Mozambique");
        countries.put("MM", "Myanmar");
        countries.put("NA", "Namibia");
        countries.put("NR", "Nauru");
        countries.put("NP", "Nepal");
        countries.put("NL", "Netherlands");
        countries.put("NC", "New Caledonia");
        countries.put("NZ", "New Zealand");
        countries.put("NI", "Nicaragua");
        countries.put("NE", "Niger");
        countries.put("NG", "Nigeria");
        countries.put("NU", "Niue");
        countries.put("NF", "Norfolk Island");
        countries.put("MP", "Northern Mariana Islands");
        countries.put("NO", "Norway");
        countries.put("OM", "Oman");
        countries.put("PK", "Pakistan");
        countries.put("PW", "Palau");
        countries.put("PS", "Palestinian Territory, Occupied");
        countries.put("PA", "Panama");
        countries.put("PG", "Papua New Guinea");
        countries.put("PY", "Paraguay");
        countries.put("PE", "Peru");
        countries.put("PH", "Philippines");
        countries.put("PN", "Pitcairn");
        countries.put("PL", "Poland");
        countries.put("PT", "Portugal");
        countries.put("PR", "Puerto Rico");
        countries.put("QA", "Qatar");
        countries.put("RE", "Reunion");
        countries.put("RO", "Romania");
        countries.put("RU", "Russian Federation");
        countries.put("RW", "Rwanda");
        countries.put("BL", "Saint Barthelemy");
        countries.put("SH", "Saint Helena");
        countries.put("KN", "Saint Kitts And Nevis");
        countries.put("LC", "Saint Lucia");
        countries.put("MF", "Saint Martin");
        countries.put("PM", "Saint Pierre And Miquelon");
        countries.put("VC", "Saint Vincent And Grenadines");
        countries.put("WS", "Samoa");
        countries.put("SM", "San Marino");
        countries.put("ST", "Sao Tome And Principe");
        countries.put("SA", "Saudi Arabia");
        countries.put("SN", "Senegal");
        countries.put("RS", "Serbia");
        countries.put("SC", "Seychelles");
        countries.put("SL", "Sierra Leone");
        countries.put("SG", "Singapore");
        countries.put("SK", "Slovakia");
        countries.put("SI", "Slovenia");
        countries.put("SB", "Solomon Islands");
        countries.put("SO", "Somalia");
        countries.put("ZA", "South Africa");
        countries.put("GS", "South Georgia And Sandwich Isl.");
        countries.put("ES", "Spain");
        countries.put("LK", "Sri Lanka");
        countries.put("SD", "Sudan");
        countries.put("SR", "Suriname");
        countries.put("SJ", "Svalbard And Jan Mayen");
        countries.put("SZ", "Swaziland");
        countries.put("SE", "Sweden");
        countries.put("CH", "Switzerland");
        countries.put("SY", "Syrian Arab Republic");
        countries.put("TW", "Taiwan");
        countries.put("TJ", "Tajikistan");
        countries.put("TZ", "Tanzania");
        countries.put("TH", "Thailand");
        countries.put("TL", "Timor-Leste");
        countries.put("TG", "Togo");
        countries.put("TK", "Tokelau");
        countries.put("TO", "Tonga");
        countries.put("TT", "Trinidad And Tobago");
        countries.put("TN", "Tunisia");
        countries.put("TR", "Turkey");
        countries.put("TM", "Turkmenistan");
        countries.put("TC", "Turks And Caicos Islands");
        countries.put("TV", "Tuvalu");
        countries.put("UG", "Uganda");
        countries.put("UA", "Ukraine");
        countries.put("AE", "United Arab Emirates");
        countries.put("GB", "United Kingdom");
        countries.put("US", "United States");
        countries.put("UM", "United States Outlying Islands");
        countries.put("UY", "Uruguay");
        countries.put("UZ", "Uzbekistan");
        countries.put("VU", "Vanuatu");
        countries.put("VE", "Venezuela");
        countries.put("VN", "Viet Nam");
        countries.put("VG", "Virgin Islands, British");
        countries.put("VI", "Virgin Islands, U.S.");
        countries.put("WF", "Wallis And Futuna");
        countries.put("EH", "Western Sahara");
        countries.put("YE", "Yemen");
        countries.put("ZM", "Zambia");
        countries.put("ZW", "Zimbabwe");

        countryDrawables.put("af", R.drawable.af);
        countryDrawables.put("ax", R.drawable.ax);
        countryDrawables.put("al", R.drawable.al);
        countryDrawables.put("dz", R.drawable.dz);
        countryDrawables.put("as", R.drawable.as);
        countryDrawables.put("ad", R.drawable.ad);
        countryDrawables.put("ao", R.drawable.ao);
        countryDrawables.put("ai", R.drawable.ai);
        countryDrawables.put("aq", R.drawable.aq);
        countryDrawables.put("ag", R.drawable.ag);
        countryDrawables.put("ar", R.drawable.ar);
        countryDrawables.put("am", R.drawable.am);
        countryDrawables.put("aw", R.drawable.aw);
        countryDrawables.put("au", R.drawable.au);
        countryDrawables.put("at", R.drawable.at);
        countryDrawables.put("az", R.drawable.az);
        countryDrawables.put("bs", R.drawable.bs);
        countryDrawables.put("bh", R.drawable.bh);
        countryDrawables.put("bd", R.drawable.bd);
        countryDrawables.put("bb", R.drawable.bb);
        countryDrawables.put("by", R.drawable.by);
        countryDrawables.put("be", R.drawable.be);
        countryDrawables.put("bz", R.drawable.bz);
        countryDrawables.put("bj", R.drawable.bj);
        countryDrawables.put("bm", R.drawable.bm);
        countryDrawables.put("bt", R.drawable.bt);
        countryDrawables.put("bo", R.drawable.bo);
        countryDrawables.put("ba", R.drawable.ba);
        countryDrawables.put("bw", R.drawable.bw);
        countryDrawables.put("bv", R.drawable.bv);
        countryDrawables.put("br", R.drawable.br);
        countryDrawables.put("io", R.drawable.io);
        countryDrawables.put("bn", R.drawable.bn);
        countryDrawables.put("bg", R.drawable.bg);
        countryDrawables.put("bf", R.drawable.bf);
        countryDrawables.put("bi", R.drawable.bi);
        countryDrawables.put("kh", R.drawable.kh);
        countryDrawables.put("cm", R.drawable.cm);
        countryDrawables.put("ca", R.drawable.ca);
        countryDrawables.put("cv", R.drawable.cv);
        countryDrawables.put("ky", R.drawable.ky);
        countryDrawables.put("td",R.drawable.td );
        countryDrawables.put("cl",R.drawable. cl);
        countryDrawables.put("cn",R.drawable.cn );
        countryDrawables.put("cx",R.drawable.cx );
        countryDrawables.put("cc",R.drawable.cc );
        countryDrawables.put("co",R.drawable.co );
        countryDrawables.put("km",R.drawable.km );
        countryDrawables.put("cg",R.drawable. cg);
        countryDrawables.put("cd",R.drawable. cd);
        countryDrawables.put("ck",R.drawable.ck );
        countryDrawables.put("cr",R.drawable.cr );
        countryDrawables.put("ci",R.drawable.ci );
        countryDrawables.put("hr",R.drawable. hr);
        countryDrawables.put("cu",R.drawable.cu );
        countryDrawables.put("cy",R.drawable.cy );
        countryDrawables.put("cz",R.drawable.cz );
        countryDrawables.put("dk",R.drawable.dk );
        countryDrawables.put("tl",R.drawable.tl );
        countryDrawables.put("tg",R.drawable.tg );
        countryDrawables.put("tk",R.drawable.tk );
        countryDrawables.put("to",R.drawable.to );
        countryDrawables.put("tt",R.drawable.tt );
        countryDrawables.put("tn",R.drawable.tn );
        countryDrawables.put("tr",R.drawable. tr);
        countryDrawables.put("tm",R.drawable.tm );
        countryDrawables.put("tc",R.drawable. tc);
        countryDrawables.put("tv",R.drawable.tv);
        countryDrawables.put("ug",R.drawable.ug );
        countryDrawables.put("ua",R.drawable. ua);
        countryDrawables.put("ae",R.drawable. ae);
        countryDrawables.put("gb",R.drawable. gb);
        countryDrawables.put("us",R.drawable. us);
        countryDrawables.put("um",R.drawable. um);
        countryDrawables.put("uy",R.drawable.uy );
        countryDrawables.put("uz",R.drawable.uz );
        countryDrawables.put("vu",R.drawable.vu);
        countryDrawables.put("ve",R.drawable.ve );
        countryDrawables.put("vn",R.drawable.vn );
        countryDrawables.put("vg",R.drawable.vg);
        countryDrawables.put("vi",R.drawable.vi);
        countryDrawables.put("wf",R.drawable.wf);
        countryDrawables.put("eh",R.drawable.eh );
        countryDrawables.put("ye",R.drawable.ye );
        countryDrawables.put("zm",R.drawable.zm );
        countryDrawables.put("zw",R.drawable.zw );
        countryDrawables.put("hr",R.drawable. hr);
        countryDrawables.put("cu",R.drawable.cu );
        countryDrawables.put("cy",R.drawable.cy );
        countryDrawables.put("cz",R.drawable.cz );
        countryDrawables.put("dk",R.drawable.dk );
        countryDrawables.put("dj",R.drawable.dj);
        countryDrawables.put("dm",R.drawable.dm );
        countryDrawables.put("ec",R.drawable.ec );
        countryDrawables.put("eg",R.drawable.eg );
        countryDrawables.put("sv",R.drawable.sv );
        countryDrawables.put("gq",R.drawable.gp );
        countryDrawables.put("er",R.drawable.er );
        countryDrawables.put("ee",R.drawable.ee );
        countryDrawables.put("et",R.drawable.et );
        countryDrawables.put("fk",R.drawable.fk );
        countryDrawables.put("fo",R.drawable.fo );
        countryDrawables.put("fj",R.drawable.fj );
        countryDrawables.put("fi",R.drawable.fi );
        countryDrawables.put("fr",R.drawable.fr );
        countryDrawables.put("gf",R.drawable.gf );
        countryDrawables.put("pf",R.drawable. pf);
        countryDrawables.put("tf",R.drawable.tf );
        countryDrawables.put("ga",R.drawable.ga );
        countryDrawables.put("gm",R.drawable. gm);
        countryDrawables.put("ge",R.drawable.ge );
        countryDrawables.put("de",R.drawable. de);
        countryDrawables.put("gh",R.drawable.gh );
        countryDrawables.put("gi",R.drawable.gi );
        countryDrawables.put("gr",R.drawable.gr );
        countryDrawables.put("gl",R.drawable.gl );
        countryDrawables.put("gd",R.drawable.gd );
        countryDrawables.put("gp",R.drawable.gp);
        countryDrawables.put("gu",R.drawable.gu );
        countryDrawables.put("gt",R.drawable. gt);
        countryDrawables.put("gg",R.drawable.gg );
        countryDrawables.put("gn",R.drawable.gn );
        countryDrawables.put("gw",R.drawable.gw );
        countryDrawables.put("gy",R.drawable. gy);
        countryDrawables.put("ht",R.drawable.ht );
        countryDrawables.put("hm",R.drawable.hm);
        countryDrawables.put("va",R.drawable.va );
        countryDrawables.put("hn",R.drawable.hn );
        countryDrawables.put("hk",R.drawable.hk );
        countryDrawables.put("hu",R.drawable. hu);
        countryDrawables.put("is",R.drawable.is );
        countryDrawables.put("in",R.drawable.in );
        countryDrawables.put("id",R.drawable. id);
        countryDrawables.put("ir",R.drawable.ir);
        countryDrawables.put("iq",R.drawable.iq );
        countryDrawables.put("ie",R.drawable.ie );
        countryDrawables.put("im",R.drawable.im);
        countryDrawables.put("it",R.drawable.it);
        countryDrawables.put("jm",R.drawable.jm);
        countryDrawables.put("jp",R.drawable.jp);
        countryDrawables.put("je",R.drawable.je);
        countryDrawables.put("jo",R.drawable.jo);
        countryDrawables.put("kz",R.drawable.kz);
        countryDrawables.put("ke",R.drawable.ke);
        countryDrawables.put("ki",R.drawable.ki);
        countryDrawables.put("kr",R.drawable.kr);
        countryDrawables.put("kw",R.drawable.kw);
        countryDrawables.put("kg",R.drawable.kg );
        countryDrawables.put("la",R.drawable.la );
        countryDrawables.put("lv",R.drawable.lv );
        countryDrawables.put("lb",R.drawable.lb );
        countryDrawables.put("ls",R.drawable.ls );
        countryDrawables.put("lr",R.drawable. lr);
        countryDrawables.put("ly",R.drawable.lu );
        countryDrawables.put("li",R.drawable.li );
        countryDrawables.put("lt",R.drawable.ly );
        countryDrawables.put("lu",R.drawable. lu);
        countryDrawables.put("mo",R.drawable.mo);
        countryDrawables.put("mk",R.drawable.mk);
        countryDrawables.put("mg",R.drawable.mg);
        countryDrawables.put("mw",R.drawable.mw );
        countryDrawables.put("my",R.drawable.my );
        countryDrawables.put("mv",R.drawable. mv);
        countryDrawables.put("ml",R.drawable.ml );
        countryDrawables.put("mt",R.drawable.mt );
        countryDrawables.put("mh",R.drawable.mh );
        countryDrawables.put("mq",R.drawable.mq );
        countryDrawables.put("mr",R.drawable.mr );
        countryDrawables.put("mu",R.drawable.mu );
        countryDrawables.put("yt",R.drawable.yt );
        countryDrawables.put("mx",R.drawable.mx );
        countryDrawables.put("fm",R.drawable.fm );
        countryDrawables.put("md",R.drawable. md);
        countryDrawables.put("mc",R.drawable.mc);
        countryDrawables.put("mn",R.drawable.mn );
        countryDrawables.put("me",R.drawable.me );
        countryDrawables.put("ms",R.drawable.ms );
        countryDrawables.put("ma",R.drawable.ma );
        countryDrawables.put("mz",R.drawable.mz );
        countryDrawables.put("mm",R.drawable.mm );
        countryDrawables.put("na",R.drawable. na);
        countryDrawables.put("nr",R.drawable. nr);
        countryDrawables.put("np",R.drawable.np);
        countryDrawables.put("nl",R.drawable. nl);
        countryDrawables.put("nc",R.drawable. nc);
        countryDrawables.put("nz",R.drawable. nz);
        countryDrawables.put("ni",R.drawable. ni);
        countryDrawables.put("ne",R.drawable.ne );
        countryDrawables.put("ng",R.drawable. ng);
        countryDrawables.put("nu",R.drawable. nu);
        countryDrawables.put("nf",R.drawable. nf);
        countryDrawables.put("mp",R.drawable.mp );
        countryDrawables.put("no",R.drawable.no );
        countryDrawables.put("om",R.drawable.om );
        countryDrawables.put("pk",R.drawable.pk );
        countryDrawables.put("pw",R.drawable.pw);
        countryDrawables.put("ps",R.drawable.ps );
        countryDrawables.put("pa",R.drawable.pa);
        countryDrawables.put("pg",R.drawable.pg);
        countryDrawables.put("py",R.drawable.py);
        countryDrawables.put("pe",R.drawable.pe);
        countryDrawables.put("ph",R.drawable.ph );
        countryDrawables.put("pn",R.drawable. pn);
        countryDrawables.put("pl",R.drawable.pl);
        countryDrawables.put("pt",R.drawable.pt );
        countryDrawables.put("pr",R.drawable. pr);
        countryDrawables.put("qa",R.drawable.qa );
        countryDrawables.put("re",R.drawable.re );
        countryDrawables.put("ro",R.drawable.ro);
        countryDrawables.put("ru",R.drawable.ru);
        countryDrawables.put("rw",R.drawable.rw);
        countryDrawables.put("bl",R.drawable.bl);
        countryDrawables.put("sh",R.drawable.sh);
        countryDrawables.put("kn",R.drawable.kn);
        countryDrawables.put("lc",R.drawable.lc);
        countryDrawables.put("mf",R.drawable.mf);
        countryDrawables.put("pm",R.drawable.pm );
        countryDrawables.put("vc",R.drawable.vc );
        countryDrawables.put("ws",R.drawable.ws );
        countryDrawables.put("sm",R.drawable.sm );
        countryDrawables.put("st",R.drawable.st );
        countryDrawables.put("sa",R.drawable. sa);
        countryDrawables.put("sn",R.drawable.sn );
        countryDrawables.put("rs",R.drawable.rs);
        countryDrawables.put("sc",R.drawable.sc );
        countryDrawables.put("sl",R.drawable.sl );
        countryDrawables.put("sg",R.drawable.sg );
        countryDrawables.put("sk",R.drawable.sk );
        countryDrawables.put("si",R.drawable.si );
        countryDrawables.put("sb",R.drawable.sb );
        countryDrawables.put("so",R.drawable.so );
        countryDrawables.put("za",R.drawable.za );
        countryDrawables.put("gs",R.drawable.gs );
        countryDrawables.put("es",R.drawable.es );
        countryDrawables.put("lk",R.drawable.lk );
        countryDrawables.put("sd",R.drawable.sd );
        countryDrawables.put("sr",R.drawable.sr );
        countryDrawables.put("sj",R.drawable. sj);
        countryDrawables.put("sz",R.drawable.sz );
        countryDrawables.put("se",R.drawable.se );
        countryDrawables.put("ch",R.drawable. ch);
        countryDrawables.put("sy",R.drawable.sy );
        countryDrawables.put("tw",R.drawable.tw );
        countryDrawables.put("tj",R.drawable.tj );
        countryDrawables.put("tz",R.drawable.tz );
        countryDrawables.put("th",R.drawable.th );

        // Initialize UI elements


        TextView scoreTextView = findViewById(R.id.score_text);

        TextView content_text = findViewById(R.id.content_text);


        scoreTextView.setText("Score: " + score);

        Flag[] flags = new Flag[4];

        Button button1 = findViewById(R.id.ans_1);
        Button button2 = findViewById(R.id.ans_2);
        Button button3 = findViewById(R.id.ans_3);
        Button button4 = findViewById(R.id.ans_4);

        reset(flags);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(button1, flags, scoreTextView,content_text);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(button2, flags, scoreTextView,content_text);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(button3, flags, scoreTextView,content_text);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer(button4, flags, scoreTextView,content_text);
            }
        });



    }
    private void reset(Flag[] flags ) {
        ImageView flagImageView =  findViewById(R.id.flag_image);

        Button button1 = findViewById(R.id.ans_1);
        Button button2 = findViewById(R.id.ans_2);
        Button button3 = findViewById(R.id.ans_3);
        Button button4 = findViewById(R.id.ans_4);



        Flag[] generatedFlags = generateFlagQuestion(flags);

        button1.setText(generatedFlags[0].getName());
        button2.setText(generatedFlags[1].getName());
        button3.setText(generatedFlags[2].getName());
        button4.setText(generatedFlags[3].getName());

        for (Flag item : generatedFlags){
            if(item.getAnswer()){
                try {
                    Resources res = getResources();
                    flagImageView.setImageResource(countryDrawables.get(item.getst()));

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        button1.setBackgroundColor(Color.GRAY);
        button2.setBackgroundColor(Color.GRAY);
        button3.setBackgroundColor(Color.GRAY);
        button4.setBackgroundColor(Color.GRAY);

    }


    private Flag[] generateFlagQuestion( Flag[] flags){

        ArrayList<String> keys = new ArrayList<>(countries.keySet());

        // shuffle the keys in the list
        Collections.shuffle(keys);

        // get the first four keys
        ArrayList<String> selectedKeys = new ArrayList<>(keys.subList(0, 4));



        // create Flag objects for each key
        for (int i = 0; i < selectedKeys.size(); i++) {
            String name = countries.get(selectedKeys.get(i));
            String imgSrc = "drawable/" + selectedKeys.get(i);

            flags[i] = new Flag(name,0, false,selectedKeys.get(i).toLowerCase());
        }


        int correctAnswerIndex = new Random().nextInt(4);
        System.out.println(  "#####################################################");
        System.out.println(  "CORRECT ANSWER:" +flags[correctAnswerIndex].getName());
        System.out.println(  "#####################################################");
        // set the value of the answer for the correct flag to true
        flags[correctAnswerIndex].setAnswer(true);

        return flags;

   }
    public void checkAnswer(Button clickedButton, Flag[] flags, TextView scoreTextView, TextView content_text) {
        String clickedButtonName = clickedButton.getText().toString();
        Flag correctAnswer = null;

        for (Flag flag : flags) {
            if (flag.getAnswer()) {
                correctAnswer = flag;
                break;
            }
        }

        if (clickedButtonName.equals(correctAnswer.getName())) {
            clickedButton.setBackgroundColor(Color.GREEN);
            score++;
            scoreTextView.setText("Score: " + score);
        } else {
            clickedButton.setBackgroundColor(Color.RED);
        }

        // Set a Timer to change the button color back to its original color after a delay
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        clickedButton.setBackgroundColor(Color.WHITE);
                        if (collectionNumber >= 25) {
                            finish();
                        } else {
                            content_text.setText(collectionNumber + "/20");
                            reset(generateFlagQuestion(flags));
                        }
                    }
                });
            }
        }, 500); // Delay the Timer by 0.5 second (adjust as needed) so you can see the color

        collectionNumber++;
    }



}