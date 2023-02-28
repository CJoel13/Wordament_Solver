package constants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordProvider {

	public static Map<Character, List<Character>> invalidLettersProvider() {
		Map<Character, List<Character>> invalidLetters = new HashMap<>();
		List<Character> aInvalid = Arrays.asList('Q');
		List<Character> bInvalid = Arrays.asList('D', 'F', 'J', 'K', 'N', '�', 'P', 'Q', 'V', 'W', 'X');
		List<Character> cInvalid = Arrays.asList('F', 'H', 'Q', 'V', 'W', '�');
		List<Character> dInvalid = Arrays.asList('F', 'H', 'J', 'K', 'Q', 'V', 'X', 'Y', '�');
		List<Character> eInvalid = Arrays.asList('Q');
		List<Character> fInvalid = Arrays.asList('D', 'H', 'J', 'K', 'M', '�', 'P', 'Q', 'V', 'W', 'Y');
		List<Character> gInvalid = Arrays.asList('C', 'H', 'J', 'M', '�', 'P', 'Q', 'V', 'W', 'X', 'Y');
		List<Character> hInvalid = Arrays.asList('B', 'H', 'J', 'K', 'M', '�', 'O', 'P', 'V', 'Q', 'Y');
		List<Character> iInvalid = Arrays.asList('Q');
		List<Character> jInvalid = Arrays.asList('C', 'F', 'G', 'H', 'J', '�', 'P', 'Q', 'T', 'V', 'W', 'X', 'Y', 'Z');
		List<Character> kInvalid = Arrays.asList('B', 'J', 'K', 'M', '�', 'P', 'Q', 'T', 'V', 'W', 'X', 'Y', 'Z');
		List<Character> lInvalid = Arrays.asList('�', 'Q', 'W');
		List<Character> mInvalid = Arrays.asList('F', '�', 'J', 'P', 'Q', 'V', 'W');
		List<Character> nInvalid = Arrays.asList('J', '�', 'Q', 'X');
		List<Character> gnInvalid = Arrays.asList('B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', '�', 'P', 'Q',
				'R', 'T', 'V', 'W', 'X', 'Y', 'Z');
		List<Character> oInvalid = Arrays.asList('Q');
		List<Character> pInvalid = Arrays.asList('D', 'F', 'G', 'J', 'K', '�', 'Q', 'V', 'W');
		List<Character> qInvalid = Arrays.asList('B', 'F', 'G', 'H', 'J', 'K', '�', 'P', 'Q', 'T', 'V', 'W', 'Y');
		List<Character> rInvalid = Arrays.asList('Q', 'J', 'M', 'Q', 'X');
		List<Character> sInvalid = Arrays.asList('J', 'Q', '�', 'V', 'X', 'Y');
		List<Character> tInvalid = Arrays.asList('D', 'J', 'K', 'Q', 'V', '�');
		List<Character> uInvalid = Arrays.asList('W');
		List<Character> vInvalid = Arrays.asList('C', 'F', 'G', 'H', 'J', 'K', 'Q', '�', 'P', 'V', 'W', 'Y', 'Z');
		List<Character> wInvalid = Arrays.asList('B', 'C', 'F', 'G', 'H', 'J', 'L', 'M', 'N', '�', 'P', 'Q', 'W', 'Z');
		List<Character> xInvalid = Arrays.asList('B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', '�', 'P', 'Q',
				'S', 'T', 'V', 'W', 'X', 'Y', 'Z');
		List<Character> yInvalid = Arrays.asList('F', 'G', 'J', 'M', '�', 'Q', 'W', 'Y', 'Z');
		List<Character> zInvalid = Arrays.asList('B', 'F', 'H', 'K', 'M', '�', 'P', 'Q', 'V', 'W', 'X', 'Y');

		invalidLetters.put('A', aInvalid);
		invalidLetters.put('B', bInvalid);
		invalidLetters.put('C', cInvalid);
		invalidLetters.put('D', dInvalid);
		invalidLetters.put('E', eInvalid);
		invalidLetters.put('F', fInvalid);
		invalidLetters.put('G', gInvalid);
		invalidLetters.put('H', hInvalid);
		invalidLetters.put('I', iInvalid);
		invalidLetters.put('J', jInvalid);
		invalidLetters.put('K', kInvalid);
		invalidLetters.put('L', lInvalid);
		invalidLetters.put('M', mInvalid);
		invalidLetters.put('N', nInvalid);
		invalidLetters.put('�', gnInvalid);
		invalidLetters.put('O', oInvalid);
		invalidLetters.put('P', pInvalid);
		invalidLetters.put('Q', qInvalid);
		invalidLetters.put('R', rInvalid);
		invalidLetters.put('S', sInvalid);
		invalidLetters.put('T', tInvalid);
		invalidLetters.put('U', uInvalid);
		invalidLetters.put('V', vInvalid);
		invalidLetters.put('W', wInvalid);
		invalidLetters.put('X', xInvalid);
		invalidLetters.put('Y', yInvalid);
		invalidLetters.put('Z', zInvalid);

		return invalidLetters;
	}

	public static Map<Character, List<String>> validDoubleWordProvider() {
		List<String> bbWords = Arrays.asList("HOBBY", "LOBBY", "SABBAT");
		List<String> ddWords = Arrays.asList("DDT", "CADDIE", "CADDIES");
		List<String> ffWords = Arrays.asList("AFFAIRE", "OFF", "OFFICE", "OFFSET", "SHERIFF", "SOUFFLE", "TOFFEE",
				"EFFIGIES");
		List<String> ggWords = Arrays.asList("JOGGING", "REGGAE");
		List<String> iiWords = Arrays.asList("CONTRARIIS", "ANTIIMPERIALISMO", "ANTIIMPERIALISTA", "ANTIIMPERIALISTAS",
				"ANTIINCENDIO", "ANTIINCENDIOS", "ANTIINFLACIONARIO", "ANTIINFLACIONARIOS", "ANTIINFLACIONARIA",
				"ANTIINFLACIONARIAS", "ANTIINFLACIONISTA", "ANTIINFLACIONISTAS", "ANTIINFLAMATORIO",
				"ANTIINFLAMATORIOS", "ANTIINFLAMATORIA", "ANTIINFLAMATORIAS", "CHIISMO", "CHIITA", "POLIINSATURADO",
				"POLIINSATURADOS", "POLIINSATURADA", "POLIINSATURADAS", "SEMIINCONSCIENCIA", "SEMIINCONSCIENTE",
				"SEMIINCONSCIENTES", "SEMIINSCRITO", "SEMIINSCRITOS", "TOXIINFECCION", "TOXIINFECCIONES");
		List<String> mmWords = Arrays.asList("BACKGAMMON", "COMMELINACEO", "COMMELINACEOS", "COMMELINACEA",
				"COMMELINACEAS", "DIGAMMA", "DIGAMMAS", "EMMENTAL", "EMMENTALES", "GAMMA", "GAMMAS", "GAMMAGLOBULINA",
				"GAMMAGRAFIA", "HUMMUS", "OMMIADA", "SUMMUM", "UMMA");
		List<String> nnWords = Arrays.asList("ANNAMITA", "ANNAMITAS", "ANNOBONES", "ANNOBONESA", "ANNUS", "CANNABACEO",
				"CANNABACEA", "CANNABIS", "CANNACEO", "CANNACEA", "CIRCUNNAVEGACION", "CIRCUNNAVEGAR", "CONNACIONAL",
				"CONNACIONALES", "CONNATURAL", "CONNATURALES", "CONNATURALIDAD", "CONNATURALIZACION", "CONNATURALIZAR",
				"CONNATURALMENTE", "CONNIVENCIA", "CONNIVENTE", "CONNIVENTES", "CONNOMBRE", "CONNOSCO", "CONNOTACION",
				"CONNOTADO", "CONNOTADA", "CONNOTAR", "CONNOTATIVO", "CONNOTATIVA", "CONNOVICIO", "CONNOVICIA",
				"CONNUBIAL", "CONNUBIO", "CONNUMERAR", "CUNNILINGUS", "DONNADIE", "ENNAVAJAR", "ENNECIARSE",
				"ENNEGRECER", "ENNEGRECIMIENTO", "ENNOBLECEDOR", "ENNOBLECEDRA", "ENNOBLECER", "ENNOBLECIMIENTO",
				"ENNOVIARSE", "ENNUDECER", "ESTANNIFERO", "ESTANNIFERA", "GIENNENSE");
		List<String> ppWords = Arrays.asList("CAPPA", "DOPPLER", "HIPPIE", "HIPPY", "KAPPA", "APPEAL", "KIPPUR");
		List<String> ssWords = Arrays.asList("BOSSA", "BRASSAVOLA", "BUSINESS", "BYPASS", "COLALESS", "CROSS",
				"CYCLO-CROSS", "DELICATESSEN", "DOSSIER", "GAUSS", "GROSSO", "IMPASSE", "LAISSEZ", "LESSUESTE", "MASS",
				"MISS", "MOTOCROSS", "MOUSSE", "PASSIM", "PICASSIANO", "PICASSIANA", "RABASSA", "BUSINESS");
		List<String> ttWords = Arrays.asList("LITTERAM", "LITTERAE", "ALLEGRETTO", "ATTO", "SITTER", "BAGUETTE",
				"CULOTTE", "GILLETTE", "MAJORETTE", "RICKETTSIA", "ROULOTTE", "SOTTOVOCE", "SOTTO", "VEDETTE",
				"VENDETTA", "WATT");
		List<String> uuWords = Arrays.asList("DUUNVIR", "DUUNVIRAL", "DUUNVIRATO", "DUUNVIRO", "PERPETUUM");
		List<String> zzWords = Arrays.asList("FIZZ", "JACUZZI", "JAZZ", "JAZZISTA", "JAZZISTICO", "JAZZISTICA", "MEZZO",
				"MEZZOSOPRANO", "MOZZARELLA", "PAPARAZZI", "PIZZA", "PIZZERIA", "PIZZERO", "PIZZERA", "PIZZICATO",
				"PREPIZZA");

		Map<Character, List<String>> validDoubleWords = new HashMap<>();
		validDoubleWords.put('B', bbWords);
		validDoubleWords.put('D', ddWords);
		validDoubleWords.put('F', ffWords);
		validDoubleWords.put('G', ggWords);
		validDoubleWords.put('I', iiWords);
		validDoubleWords.put('M', mmWords);
		validDoubleWords.put('N', nnWords);
		validDoubleWords.put('P', ppWords);
		validDoubleWords.put('S', ssWords);
		validDoubleWords.put('T', ttWords);
		validDoubleWords.put('U', uuWords);
		validDoubleWords.put('Z', zzWords);

		return validDoubleWords;
	}

	public static Map<String, List<String>> validRareWordProvider() {
		List<String> waWords = Arrays.asList("HARDWARE", "HAWAIANO", "HAWAIANOS", "HAWAIANA", "HAWAIANAS", "KUWAITI",
				"SAWALI", "SOFTWARE", "SWAHILI", "TAIWANES", "TAIWANESES", "TAIWANESA", "TAIWANESAS", "TAWAHKA",
				"TWAHKA", "WAGNERIANO", "WAGNERIANOS", "WAGNERIANA", "WAGNERIANAS", "WAHABI", "WAHABISMO", "WAHABITA",
				"WALKIE-TALKIE", "WALKMAN", "WANTAN", "WASHINGTONIANO", "WASHINGTONIANOS", "WASHINGTONIANA",
				"WASHINGTONIANAS", "WATERPOLISTA", "WATERPOLISTAS", "WATERPOLO", "WATT", "WAU");
		List<String> cbWords = Arrays.asList("BRICBARCA", "PECBLENDA");
		List<String> dbWords = Arrays.asList("FEEDBACK");
		List<String> gbWords = Arrays.asList("RUGBISTA", "RUGBISTAS", "RUGBY");
		List<String> hbWords = Arrays.asList("FLASHBACK", "PECHBLENDA");
		List<String> ybWords = Arrays.asList("FRAYBENTINO", "FRAYBENTINOS", "FRAYBENTINA", "FRAYBENTINAS", "PLAYBACK",
				"PLAYBOY");
		List<String> zbWords = Arrays.asList("BIZBIRINDO", "BIZBIRINDOS", "BIZBIRINDA", "BIZBIRINDAS", "CABIZBAJO",
				"CABIZBAJOS", "CABIZBAJA", "CABIZBAJAS", "UZBEKO", "UZBEKOS", "UZBEKA", "UZBEKAS");
		List<String> dcWords = Arrays.asList("VODCA");
		List<String> gcWords = Arrays.asList("ACHOGCHA");
		List<String> jcWords = Arrays.asList("ACHOJCHA", "SOROJCHI");
		List<String> kcWords = Arrays.asList("CAKCHIQUEL", "QUEKCHI");
		List<String> mcWords = Arrays.asList("CIRCUMCIRCA", "POCOMCHI");
		List<String> ycWords = Arrays.asList("CYCLOCROSS", "LYCRA", "LYCRAS", "SEYCHELLENSE");
		List<String> cdWords = Arrays.asList("ANECDOTA", "ANECDOTAS", "ANECDOTARIO", "ANECDOTARIOS", "ANECDOTICO",
				"ANECDOTICA", "ANECDOTISMO", "ANECDOTISTA", "ANECDOTISTAS", "ECDISIS", "ECDOTICA", "ECDOTICO",
				"ECDOTICOS", "ECDOTICA", "ECDOTICAS", "SINECDOQUE");
		List<String> gdWords = Arrays.asList("AMIGDALA", "AMIGDALAS", "AMIGDALACEO", "AMIGDALACEA", "AMIGDALINA",
				"AMIGDALITIS", "BAGDADI", "LUGDUNENSE", "MAGDALENA", "MAGDALENAS", "MAGDALENENSE", "MAGDALENENSES",
				"MAGDALENICO", "MAGDALENICOS", "MAGDALENICA", "MAGDALENICAS", "MAGDALENIENSE", "MAGDALENIENSES",
				"MAGDALEON", "SOGDIANO", "SOGDIANOS", "SOGDIANA", "SOGDIANAS");
		List<String> mdWords = Arrays.asList("DUMDUM");
		List<String> pdWords = Arrays.asList("CAPDAL");
		List<String> tdWords = Arrays.asList("POSTDATA", "POSTDILUVIANO, NA", "POSTDORSAL", "POSTDORSO");
		List<String> zdWords = Arrays.asList("LAZDRAR", "LEZDA", "LEZDERO", "MAZDEISMO");
		List<String> weWords = Arrays.asList("MAXWELL", "NDOWE", "TWEED", "WEB", "WEBER", "WEBINARIO", "WEIMARES",
				"WEIMARESA", "WELLINGTONIA", "WESTFALIANO", "WESTFALIANOS", "WESTFALIANA", "WESTFALIANAS");
		List<String> bfWords = Arrays.asList("SUBFEBRIL", "SUBFIADOR", "SUBFILO", "SUBFORO", "SUBFUSIL");
		List<String> cfWords = Arrays.asList("ECFRASIS", "MACFERLAN");
		List<String> gfWords = Arrays.asList("KUNGFU");
		List<String> tfWords = Arrays.asList("POSTFIJO", "POSTFIJOS", "POSTFIJO", "POSTFIJOS", "POSTFIJA", "POSTFIJAS",
				"POSTFRANQUISMO", "POSTFRANQUISTA", "VESTFALIANO", "VESTFALIANOS", "VESTFALIANA", "VESTFALIANAS",
				"WESTFALIANO", "WESTFALIANOS", "WESTFALIANO", "WESTFALIANOS", "WESTFALIANA", "WESTFALIANAS");
		List<String> xfWords = Arrays.asList("EXFOLIACION", "EXFOLIADOR", "EXFOLIADORES", "EXFOLIADORA", "EXFOLIADORAS",
				"EXFOLIANTE", "EXFOLIANTES", "EXFOLIAR", "EXFOLIATIVO", "EXFOLIATIVOS", "EXFOLIATIVA", "EXFOLIATIVAS");
		List<String> zfWords = Arrays.asList("FAZFERIR");
		List<String> bgWords = Arrays.asList("SUBGENERO", "SUBGENEROS", "SUBGOBERNADOR", "SUBGOBERNADORES",
				"SUBGOBERNADORA", "SUBGOBERNADORAS", "SUBGRUPO", "SUBGRUPOS");
		List<String> fgWords = Arrays.asList("AFGANO", "AFGANOS", "AFGANA", "AFGANAS");
		List<String> kgWords = Arrays.asList("BACKGAMMON", "GINKGO");
		List<String> tgWords = Arrays.asList("POSTGRADO", "POSTGRADUADO", "POSTGRADUADOS", "POSTGRADUADA",
				"POSTGRADUADAS", "POSTGUERRA", "ROENTGEN", "ROENTGENIO", "ROENTGENIOS");
		List<String> dhWords = Arrays.asList("ADHERECER", "ADHERENCIA", "ADHERENTE", "ADHERENTES", "ADHERIR",
				"ADHESION", "ADHESIVIDAD", "ADHESIVO", "ADHESIVOS", "ADHESIVA", "ADHESIVAS", "ADHORTAR",
				"ANTIADHERENTE", "ANTIADHERENTES", "AUTOADHESIVO", "AUTOADHESIVOS", "AUTOADHESIVA", "AUTOADHESIVAS",
				"REDHIBICION", "REDHIBIR", "REDHIBITORIO", "REDHIBITORIA");
		List<String> fhWords = Arrays.asList("SULFHIDRICO", "SULFHIDRICA");
		List<String> ghWords = Arrays.asList("BRIGHT", "COPYRIGHT", "GHANES", "GHANESES", "GHANESA", "GHANESAS",
				"LIGHT");
		List<String> thWords = Arrays.asList("APARTHEID", "APARTHOTEL", "BEETHOVENIANO", "BEETHOVENIANOS",
				"BEETHOVENIANA", "BEETHOVENIANAS", "ETHOS", "CATHEDRA", "GOETHEANO", "GOETHEANOS", "GOETHEANA",
				"GOETHEANAS", "GOETHIANO", "GOETHIANOS", "GOETHIANA", "GOETHIANAS", "LUTHERIA", "LUTHIER", "PATHOS",
				"PENTHOUSE", "RUTHERFORDIO", "THRILLER");
		List<String> whWords = Arrays.asList("WHISKERIA", "WHISKY");
		List<String> zhWords = Arrays.asList("ALZHEIMER", "ALZHEIMER");

		List<String> kjWords = Arrays.asList("BLACKJACK");
		List<String> mjWords = Arrays.asList("UMJU");
		List<String> sjWords = Arrays.asList("DESJARRETADERA", "DESJARRETADERAS", "DESJARRETAR", "DESJARRETE",
				"DESJUGAR", "DESJUICIADO", "DESJUICIADOS", "DESJUICIADA", "DESJUICIADAS", "DESJUNTAMIENTO", "DESJUNTAR",
				"DISJUNTOS", "ROSJO");
		List<String> dkWords = Arrays.asList("VODKA");
		List<String> ekWords = Arrays.asList("BAEDEKER", "EKUK", "EUREKA", "KOPEK", "PEKIN�S", "PEKINESES", "PEKIN�SA",
				"PEKIN�SAS", "PREK�NDER", "QUEKCH�", "TAEKWONDO", "TELEKINESIA", "TELEKINESIS", "UZBEKO", "UZBEKOS",
				"UZBEKA", "UZBEKAS");
		List<String> fkWords = Arrays.asList("KAFKIANO", "KAFKIANOS", "KAFKIANA", "KAFKIANAS");
		List<String> gkWords = Arrays.asList("HONGKON�S", "HONGKON�SES", "HONGKON�SA", "HONGKON�SAS");
		List<String> hkWords = Arrays.asList("TAWAHKA", "TWAHKA");
		List<String> lkWords = Arrays.asList("ALKERMES", "FAULKNERIANO", "FAULKNERIANOS", "FAULKNERIANA",
				"FAULKNERIANAS", "FOLK", "FOLKLOR", "FOLKLORE", "FOLKL�RICO", "FOLKL�RICA", "FOLKLORISMO",
				"FOLKLORISTA", "FOLKLORISTAS", "POLKA", "POLKAS", "VALKIRIA", "VALKIRIAS", "WALKIETALKIE", "WALKMAN");
		List<String> nkWords = Arrays.asList("B�NKER", "BUNKERIZACI�N", "BUNKERIZAR", "CIBERPUNK", "CL�NKER",
				"FRANKLIN", "GINKGO", "NOMENKLATURA", "PINKY", "PUNK", "PUNKI", "RANKING", "TANKA");
		List<String> rkWords = Arrays.asList("BERKELIO", "BURKA", "BURKAS", "BURKIN�S", "BURKIN�SES", "BURKIN�SA",
				"BURKIN�SAS", "CHERKESA", "CUARK", "MARKETEAR", "MARKETING", "PARKA", "PARKING", "PARKINSON",
				"P�RKINSON", "PARKINSONIANO", "PARKINSONIANOS", "PARKINSONIANA", "PARKINSONIANAS", "PARKINSONISMO",
				"QUARK", "TURKMENO", "TURKMENOS", "TURKMENA", "TURKMENAS", "YORK");
		List<String> skWords = Arrays.asList("ALASKE�O", "ALASKE�OS", "ALASKE�A", "ALASKE�AS", "ASKENAZI", "AURRESKU",
				"EUSKALD�N", "EUSKALDUNA", "EUSKALDUNIZACI�N", "EUSKALDUNIZAR", "EUSKARA", "�USKARA", "EUSKARO",
				"EUSKARA", "EUSKARAS", "EUSKAROS", "EUSKERA", "KATIUSKA", "SKETCH", "TROTSKISMO", "TROTSKISTA",
				"WHISKER�A", "WHISKY");
		List<String> ukWords = Arrays.asList("EKUK", "KABUKI", "KALMUKO", "KALMUKOS", "KALMUKA", "KALMUKAS", "NOBUK",
				"UKELELE", "UKELELES", "VOLAPUK");
		List<String> dlWords = Arrays.asList("ADL�TERE", "CUODLIBETAL", "CUODLIB�TICO", "CUODLIB�TICOS", "CUODLIB�TICA",
				"CUODLIB�TICAS", "CUODLIBETO");
		List<String> hlWords = Arrays.asList("KOHL", "MAHLERIANO", "MAHLERIANOS", "MAHLERIANA", "MAHLERIANAS");
		List<String> jlWords = Arrays.asList("PAJLA");
		List<String> klWords = Arrays.asList("FOLKLOR", "FOLKLORE", "FOLKL�RICO", "FOLKL�RICOS", "FOLKL�RICA",
				"FOLKL�RICAS", "FOLKLORISMO", "FOLKLORISTA", "FOLKLORISTAS", "FRANKLIN", "KLISTR�N", "NOMENKLATURA");
		List<String> mlWords = Arrays.asList("CR�MLECH", "KREMLIN", "KREMLINOLOG�A", "KREMLIN�LOGO", "KREMLIN�LOGOS",
				"KREMLIN�LOGA", "KREMLIN�LOGAS");
		List<String> vlWords = Arrays.asList("KEVLAR");
		List<String> xlWords = Arrays.asList("EXLIBRIS");
		List<String> ylWords = Arrays.asList("TAYLORISMO");
		List<String> zlWords = Arrays.asList("GUZLA", "PUZLE");
		List<String> bmWords = Arrays.asList("ANTISUBMARINO", "ANTISUBMARINOS", "ANTISUBMARINA", "ANTISUBMARINAS",
				"SUBMARINISMO", "SUBMARINISTA", "SUBMARINISTAS", "SUBMARINO", "SUBMARINA", "SUBMAXILAR",
				"SUBMINISTRACI�N", "SUBMINISTRADOR", "SUBMINISTRADORES", "SUBMINISTRADORA", "SUBMINISTRADORAS",
				"SUBMINISTRAR", "SUBM�LTIPLO", "SUBM�LTIPLOS", "SUBM�LTIPLA", "SUBMUNDO", "SUBMUNDOS");
		List<String> cmWords = Arrays.asList("ACM�", "BRACM�N", "CHACMOL", "DIDRACMA", "DISCMAN", "DRACMA",
				"FRANCMASONER�A", "FRANCMAS�NICO", "FRANCMAS�NICOS", "FRANCMAS�NICA", "FRANCMAS�NICAS", "FRANCMAS�N",
				"FRANCMAS�NES", "FRANCMAS�NA", "FRANCMAS�NAS", "LUCMA", "TETRADRACMA");
		List<String> hmWords = Arrays.asList("BRAHM�N", "BRAHM�NICO", "BRAHM�NICOS", "BRAHM�NICA", "BRAHM�NICAS",
				"BRAHMANISMO", "BRAHM�N", "ESTABLISHMENT", "LEISHMANIASIS", "LEISHMANIOSIS", "OHM", "OHMS", "�HMICO",
				"�HMICA", "OHM�METRO", "OHMIO", "OHMIOS");
		List<String> kmWords = Arrays.asList("TURKMENO", "TURKMENOS", "TURKMENA", "TURKMENAS", "WALKMAN");
		List<String> xmWords = Arrays.asList("MAXMORD�N", "SEXMERO", "SEXMO", "SEXMA");
		List<String> ymWords = Arrays.asList("AYM�", "GUAYME�O", "GUAYME�OS", "GUAYME�A", "GUAYME�AS", "GUAYMENSE",
				"GUAYMENSES", "PYME", "SEXSYMBOL");
		List<String> bnWords = Arrays.asList("ABNEGACI�N", "ABNEGADO", "ABNEGADOS", "ABNEGADA", "ABNEGADAS", "ABNEGAR",
				"DUBNIO", "OBNOXIO", "OBNOXIA", "OBNUBILACI�N", "OBNUBILAR", "SUBNITRATO", "SUBNORMAL", "SUBNORMALES",
				"SUBNORMALIDAD", "SUBNOTA");
		List<String> dnWords = Arrays.asList("ADNADO", "ADNADA", "ADNATA", "ADNATO", "ADNATA", "ADNOMINAL",
				"ADNOMINALES", "EQUIDNA");
		List<String> hnWords = Arrays.asList("CUAUHNAHUACENSE");
		List<String> knWords = Arrays.asList("FAULKNERIANO", "FAULKNERIANA");
		List<String> pnWords = Arrays.asList("APNEA", "APNE�STA", "APNE�STAS", "CAPNOMANCIA", "CAPNOMANC�A", "DIPNEO",
				"DIPNEA", "HIPNAL", "HIPNOSIS", "HIPN�TICO", "HIPN�TICOS", "HIPN�TICA", "HIPN�TICAS", "HIPNOTISMO",
				"HIPNOTIZACI�N", "HIPNOTIZADOR", "HIPNOTIZADORES", "HIPNOTIZADORA", "HIPNOTIZADORAS", "HIPNOTIZANTE",
				"HIPNOTIZANTES", "HIPNOTIZAR", "PNEUMA", "TAQUIPNEA");
		List<String> wnWords = Arrays.asList("CLOWN", "DOWN");
		List<String> ynWords = Arrays.asList("KEYNESIANISMO", "KEYNESIANO", "KEYNESIANOS", "KEYNESIANAS", "KEYNESIANA");
		List<String> sgnWords = Arrays.asList("�IS�IL");
		List<String> woWords = Arrays.asList("HOLLYWOODENSE", "HOLLYWOODENSES", "HOLLYWOODIANO", "HOLLYWOODIANA",
				"HOLLYWOODIENSE", "HOLLYWOODIENSES", "SHOWWOMAN", "SUPERWOMAN", "TAEKWONDO", "WOK", "WOLFRAMIO");
		List<String> bpWords = Arrays.asList("SUBPREFECTO", "SUBPREFECTOS", "SUBPREFECTA", "SUBPREFECTAS",
				"SUBPREFECTURA", "SUBPREFECTURAS", "SUBPRODUCTO", "SUBPRODUCTOS");
		List<String> cpWords = Arrays.asList("YUCPA");
		List<String> hpWords = Arrays.asList("GUASHPIRA");
		List<String> npWords = Arrays.asList("INPUT");
		List<String> ypWords = Arrays.asList("BYPASS");
		List<String> zpWords = Arrays.asList("CHOZPAR", "CHOZPO", "CHOZP�N", "CHOZP�NA", "GAZPACHERO", "GAZPACHEROS",
				"GAZPACHO", "GAZPACHOS", "GAZPACHUELO", "GAZPACHUELOS", "GUZP�TARO", "PAZPUERCO", "PAZPUERCOS",
				"PAZPUERCA", "PAZPUERCAS", "PEZPALO", "PEZPITA", "PEZP�TALO", "PIZPERETA", "PIZPIERNO", "PIZPIRETO",
				"PIZPIRETOS", "PIZPIRETA", "PIZPIRETAS", "PIZPIRIGA�A", "PIZPITA", "PIZPITAS", "PIZPITILLO",
				"PIZPITILLOS");
		/**
		 * Last
		 */
		List<String> cqWords = Arrays.asList("BECQUEREL", "BECQUERIANA", "BECQUERIANO", "BECQUERIANOS", "BECQUERIANA",
				"BECQUERIANAS");
		List<String> dqWords = Arrays.asList("ADQUIRENTE", "ADQUIRENTES", "ADQUIRIBLE", "ADQUIRIBLES", "ADQUIRIDO",
				"ADQUIRIDOS", "ADQUIRIDA", "ADQUIRIDAS", "ADQUIRIDOR", "ADQUIRIDORES", "ADQUIRIDORA", "ADQUIRIDORAS",
				"ADQUIRIENTE", "ADQUIRIENTES", "ADQUIRIR", "ADQUISICI�N", "ADQUISICI�NES", "ADQUISIDOR", "ADQUISIDORES",
				"ADQUISIDORA", "ADQUISIDORAS", "ADQUISITIVO", "ADQUISITIVA", "COADQUISICI�N", "COADQUISICI�NES",
				"READQUIRIR");
		List<String> mqWords = Arrays.asList("CUMQUIBUS");
		List<String> xqWords = Arrays.asList("CALPIXQUE", "COXQUEAR", "EXQUISITAMENTE", "EXQUISITEZ", "EXQUISITO",
				"EXQUISITOS", "EXQUISITA", "EXQUISITAS", "NIXQUEAR", "TAXQUE�O", "TAXQUE�OS", "TAXQUE�A", "TAXQUE�AS");
		List<String> hrWords = Arrays.asList("BAHREIN�", "BOHRIO", "CHRISTMAS", "FAHRENHEIT", "MIHRAB", "THRILLER");
		List<String> krWords = Arrays.asList("CHAKRA", "CHAKRAS", "KRAUSISMO", "KRAUSISTA", "KRAUSISTAS", "KREMLIN",
				"KREMLINOLOG�A", "KREMLIN�LOGO", "KREMLIN�LOGOS", "KREMLIN�LOGA", "KREMLIN�LOGAS", "KRIL", "KRIPT�N",
				"KRIS");
		List<String> lrWords = Arrays.asList("ALREDEDOR", "ALREDEDORES", "ALREVESADO", "ALREVESADOS", "ALREVESADA",
				"ALREVESADAS", "ALROTA", "DELASOLR�", "GESOLRE�T", "MALROTADOR", "MALROTADORES", "MALROTADORA",
				"MALROTADORAS", "MALROTAR", "MILRAYAS");
		List<String> vrWords = Arrays.asList("CHEVR�N");
		List<String> wrWords = Arrays.asList("LAWRENCIO");
		List<String> yrWords = Arrays.asList("BYRONIANO", "BYRONIANOS", "BYRONIANA", "BYRONIANAS", "COPYRIGHT");
		List<String> zrWords = Arrays.asList("LAZRAR");
		List<String> csWords = Arrays.asList("FACS�MIL", "FACSIMILAR", "FACS�MILE", "FUCSIA", "FUCSINA", "HICSO",
				"HICSA", "MACSURA", "TELEFACS�MIL");
		List<String> dsWords = Arrays.asList("ADSCRIBIBLE", "ADSCRIBIR", "ADSCRIPCI�N", "ADSCRIPTO", "ADSCRIPTOS",
				"ADSCRIPTA", "ADSCRIPTAS", "ADSCRITO", "ADSCRITOS", "ADSCRITA", "ADSCRITAS", "ADSORBENTE",
				"ADSORBENTES", "ADSORBER", "ADSORCI�N", "ADSTRATO", "ADSTRICCI�N", "ADSTRICCI�NES", "ADSTRINGENTE",
				"ADSTRINGENTES", "ADSTRINGIR", "DSETA", "SUDSUDESTE", "SUDSUDOESTE", "WINDSURF", "WINDSURFING",
				"WINDSURFISTA", "WINDSURFISTA");
		List<String> fsWords = Arrays.asList("OFFSET");
		List<String> gsWords = Arrays.asList("�NGSTROM", "TUNGSTENO");
		List<String> hsWords = Arrays.asList("PCHS");
		List<String> ksWords = Arrays.asList("BACKSTAGE");
		List<String> msWords = Arrays.asList("AMSTERDAM�S", "AMSTERDAM�SA", "DARMSTATIO", "H�MSTER", "SAMSARA");
		List<String> tsWords = Arrays.asList("BOTSUANO", "BOTSUANOS", "BOTSUANA", "BOTSUANAS", "FUTSAL", "JIU-JITSU",
				"KITSCH", "RICKETTSIA", "TROTSKISMO", "TROTSKISTA", "TSUNAMI", "TSUNAMIS", "TUTSI");
		List<String> wsWords = Arrays.asList("RAWSENSE");
		List<String> zsWords = Arrays.asList("NIETZSCHEANO", "NIETZSCHEANA");
		List<String> gtWords = Arrays.asList("RAGTIME", "WASHINGTONIANO", "WASHINGTONIANOS", "WASHINGTONIANA",
				"WASHINGTONIANAS", "WELLINGTONIA");
		List<String> htWords = Arrays.asList("BRECHTIANO", "BRECHTIANOS", "BRECHTIANA", "BRECHTIANAS", "BRIGHT",
				"COPYRIGHT", "CUESHTE", "LIECHTENSTEINIANO", "LIECHTENSTEINIANOS", "LIECHTENSTEINIANA",
				"LIECHTENSTEINIANAS", "LIGHT", "TOTOMOCHTLE");
		List<String> mtWords = Arrays.asList("COMTO", "COMTOS", "COMTA", "COMTAS", "FEMTO", "FEMTOGRAMO", "FEMTOGRAMOS",
				"RADIUMTERAPIA", "TAMTAM", "TAMT�N");
		List<String> wtWords = Arrays.asList("NEWTON", "NEWTONIANO", "NEWTONIANA");
		List<String> ytWords = Arrays.asList("BYTE", "BYTES", "GIGABYTE", "GIGABYTES", "KILOBYTE", "KILOBYTES",
				"MEGABYTE", "MEGABYTES", "TERABYTE", "TERABYTES");
		List<String> ztWords = Arrays.asList("AZTECA", "AZTECAS", "AZTEQUISMO", "AZTOR", "CACOMIZTLE", "CHINAZTE",
				"TEPOZTECO", "TEPOZTECOS", "TEPOZTECAS", "TEPOZTECA", "YUTOAZTECA", "YUTOAZTECAS");
		List<String> kuWords = Arrays.asList("ABAKU�", "AURRESKU", "EKUK", "HAIKU", "IKURRI�A", "KIKUYO", "KUFIYA",
				"KUNG-FU", "KUNGF�", "KURDO", "KURDOS", "KURDA", "KURDAS", "KUWAIT�", "OKUPA", "OKUPAR", "SUDOKU",
				"YAKUTO", "YAKUTA", "YAKUTOS", "YAKUTAS");
		List<String> bvWords = Arrays.asList("OBVENCI�N", "OBVENCIONAL", "OBVIABLE", "OBVIAMENTE", "OBVIAR", "OBVIEDAD",
				"OBVIO", "OBVIA", "SUBVALORACI�N", "SUBVALORAR", "SUBVENCI�N", "SUBVENCIONABLE", "SUBVENCIONAR",
				"SUBVENIO", "SUBVENIR", "SUBVERSI�N", "SUBVERSIVO", "SUBVERSIVOS", "SUBVERSIVA", "SUBVERSIVAS",
				"SUBVERSOR", "SUBVERSORES", "SUBVERSORA", "SUBVERSORAS", "SUBVERTIR");
		List<String> mvWords = Arrays.asList("CORAMVOBIS");
		List<String> tvWords = Arrays.asList("POSTVENTA", "POSTVERBAL");
		List<String> xvWords = Arrays.asList("EXVOTO");
		List<String> awWords = Arrays.asList("HAWAIANO", "HAWAIANOS", "HAWAIANA", "HAWAIANAS", "LAWRENCIO", "RAWSENSE",
				"SAWALI", "TAWAHKA");
		List<String> dwWords = Arrays.asList("HARDWARE", "S�NDWICH", "S�NDWICHES", "SANDWICHER�A", "SANDWICHER�AS",
				"SANDWICHERO", "SANDWICHEROS", "SANDWICHERA", "SANDWICHERAS");
		List<String> ewWords = Arrays.asList("NEWTON", "NEWTONS", "NEWTONIANO", "NEWTONIANOS", "NEWTONIANA",
				"NEWTONIANAS");
		List<String> iwWords = Arrays.asList("KIWI", "KIWIS", "TAIWAN�S", "TAIWAN�SES", "TAIWAN�SA", "TAIWAN�SAS");
		List<String> kwWords = Arrays.asList("TAEKWONDO");
		List<String> owWords = Arrays.asList("BUNGALOW", "CLOWN", "DOWN", "NDOWE", "NDOW�", "REALITYSHOW", "SHOW",
				"SHOWS", "SHOWBUSINESS", "SHOWMAN", "SHOWWOMAN");
		List<String> rwWords = Arrays.asList("DARWINIANO", "DARWINIANOS", "DARWINIANA", "DARWINIANAS", "DARWINISMO",
				"DARWINISTA", "DARWINISTAS", "NEODARWINISMO", "SUPERWOMAN");
		List<String> swWords = Arrays.asList("SWAHILI", "SWING");
		List<String> twWords = Arrays.asList("SOFTWARE", "TWAHKA", "TWEED", "TWIST");
		List<String> uwWords = Arrays.asList("KUWAIT�");
		List<String> xwWords = Arrays.asList("MAXWELL");
		List<String> ywWords = Arrays.asList("HOLLYWOODENSE", "HOLLYWOODENSES", "HOLLYWOODIANO", "HOLLYWOODIANOS",
				"HOLLYWOODIANA", "HOLLYWOODIANAS", "HOLLYWOODIENSE", "HOLLYWOODIENSES");
		List<String> rxWords = Arrays.asList("ANTIMARXISMO", "ANTIMARXISTA", "ANTIMARXISTAS", "MARXISMO", "MARXISTA",
				"MARXISTAS");
		List<String> cyWords = Arrays.asList("CYCLOCROSS", "NANCY");
		List<String> dyWords = Arrays.asList("ADYACENCIA", "ADYACENCIAS", "ADYACENTE", "ADYACENTES", "ADYUVANTE",
				"ADYUVANTES", "BODY", "BRANDY", "COADYUTOR", "COADYUTORES", "COADYUTORIO", "COADYUTORIOS",
				"COADYUTORIA", "COADYUTORIAS", "COADYUVADOR", "COADYUVADORES", "COADYUVADORA", "COADYUVADORAS",
				"COADYUVANTE", "COADYUVANTES", "COADYUVAR", "LADY");
		List<String> hyWords = Arrays.asList("VICHY");
		List<String> kyWords = Arrays.asList("PINKY", "WHISKY");
		List<String> lyWords = Arrays.asList("CHANTILLY", "HOLLYWOODENSE", "HOLLYWOODENSES", "HOLLYWOODIANO",
				"HOLLYWOODIANOS", "HOLLYWOODIANA", "HOLLYWOODIANAS", "HOLLYWOODIENSE", "HOLLYWOODIENSES", "LYCRA",
				"RALLY");
		List<String> pyWords = Arrays.asList("COPYRIGHT", "HIPPY", "PYME", "PYMES");
		List<String> ryWords = Arrays.asList("COUNTRY", "CURRY", "FERRY", "HENRY", "INTERYACENTE", "INTERYACENTES",
				"SUPERY�", "TORY");
		List<String> syWords = Arrays.asList("DESYEMAR", "DESYERBA", "DESYERBADOR", "DESYERBADORES", "DESYERBADORA",
				"DESYERBADORAS", "DESYERBAR", "DESYERBE", "DESYERBO", "DESYUGAR", "DESYUNCIR", "DISYUNCI�N",
				"DISYUNTIVA", "DISYUNTIVAS", "DISYUNTIVAMENTE", "DISYUNTIVO", "DISYUNTIVOS", "DISYUNTIVA",
				"DISYUNTIVAS", "DISYUNTOR", "DISYUNTORES", "DISYUNTO", "DISYUNTA", "SEXSYMBOL");
		List<String> tyWords = Arrays.asList("PANTY", "PARTY", "REALITY", "REALITYSHOW");
		List<String> vyWords = Arrays.asList("HEAVY", "HEAVYMETAL");
		List<String> xyWords = Arrays.asList("SEXY");
		List<String> czWords = Arrays.asList("CZARDA", "ECZEMA", "ECZEMATOSO", "ECZEMATOSA");
		List<String> dzWords = Arrays.asList("KODZITO", "PAPADZUL", "PAPADZULES");
		List<String> gzWords = Arrays.asList("ZIGZAG", "ZIGZAGUEANTE", "ZIGZAGUEAR", "ZIGZAGUEO");
		List<String> jzWords = Arrays.asList("MAJZ�N");
		List<String> szWords = Arrays.asList("DESZAFRAR", "DESZAFRE", "DESZOCAR", "DESZULACAR", "DESZUMAR", "ZISZ�S");
		List<String> tzWords = Arrays.asList("ABERTZALE", "ABERTZALISMO", "BATZOKI", "CHINTZ", "DANTZARI", "ERTZAINA",
				"ERTZAINTZA", "HERTZ", "HOATZIN", "ITZAJ", "KIBUTZ", "NIETZSCHEANO", "NIETZSCHEANOS", "NIETZSCHEANA",
				"NIETZSCHEANAS", "QUETZAL", "QUETZALTECO", "QUETZALTECOS", "QUETZALTECA", "QUETZALTECAS", "SELTZ");

		Map<String, List<String>> map = new HashMap<>();
		map.put("WA", waWords);
		map.put("CB", cbWords);
		map.put("DB", dbWords);
		map.put("GB", gbWords);
		map.put("HB", hbWords);
		map.put("YB", ybWords);
		map.put("ZB", zbWords);
		map.put("DC", dcWords);
		map.put("GC", gcWords);
		map.put("JC", jcWords);
		map.put("KC", kcWords);
		map.put("MC", mcWords);
		map.put("YC", ycWords);
		map.put("CD", cdWords);
		map.put("GD", gdWords);
		map.put("MD", mdWords);
		map.put("PD", pdWords);
		map.put("TD", tdWords);
		map.put("ZD", zdWords);
		map.put("WE", weWords);
		map.put("BF", bfWords);
		map.put("CF", cfWords);
		map.put("GF", gfWords);
		map.put("TF", tfWords);
		map.put("XF", xfWords);
		map.put("ZF", zfWords);
		map.put("BG", bgWords);
		map.put("FG", fgWords);
		map.put("KG", kgWords);
		map.put("TG", tgWords);
		map.put("DH", dhWords);
		map.put("FH", fhWords);
		map.put("GH", ghWords);
		map.put("TH", thWords);
		map.put("WH", whWords);
		map.put("ZH", zhWords);
		map.put("KJ", kjWords);
		map.put("MJ", mjWords);
		map.put("SJ", sjWords);
		map.put("DK", dkWords);
		map.put("EK", ekWords);
		map.put("FK", fkWords);
		map.put("GK", gkWords);
		map.put("HK", hkWords);
		map.put("LK", lkWords);
		map.put("NK", nkWords);
		map.put("RK", rkWords);
		map.put("SK", skWords);
		map.put("UK", ukWords);
		map.put("DL", dlWords);
		map.put("HL", hlWords);
		map.put("JL", jlWords);
		map.put("KL", klWords);
		map.put("ML", mlWords);
		map.put("VL", vlWords);
		map.put("XL", xlWords);
		map.put("YL", ylWords);
		map.put("ZL", zlWords);
		map.put("BM", bmWords);
		map.put("CM", cmWords);
		map.put("HM", hmWords);
		map.put("KM", kmWords);
		map.put("XM", xmWords);
		map.put("YM", ymWords);
		map.put("BN", bnWords);
		map.put("DN", dnWords);
		map.put("HN", hnWords);
		map.put("KN", knWords);
		map.put("PN", pnWords);
		map.put("WN", wnWords);
		map.put("YN", ynWords);
		map.put("SGN", sgnWords);
		map.put("WO", woWords);
		map.put("BP", bpWords);
		map.put("CP", cpWords);
		map.put("HP", hpWords);
		map.put("NP", npWords);
		map.put("YP", ypWords);
		map.put("ZP", zpWords);
		map.put("CQ", cqWords);
		map.put("DQ", dqWords);
		map.put("MQ", mqWords);
		map.put("XQ", xqWords);
		map.put("HR", hrWords);
		map.put("KR", krWords);
		map.put("LR", lrWords);
		map.put("VR", vrWords);
		map.put("WR", wrWords);
		map.put("YR", yrWords);
		map.put("ZR", zrWords);
		map.put("CS", csWords);
		map.put("DS", dsWords);
		map.put("FS", fsWords);
		map.put("GS", gsWords);
		map.put("HS", hsWords);
		map.put("KS", ksWords);
		map.put("MS", msWords);
		map.put("TS", tsWords);
		map.put("WS", wsWords);
		map.put("ZS", zsWords);
		map.put("GT", gtWords);
		map.put("HT", htWords);
		map.put("MT", mtWords);
		map.put("WT", wtWords);
		map.put("YT", ytWords);
		map.put("ZT", ztWords);
		map.put("KU", kuWords);
		map.put("BV", bvWords);
		map.put("MV", mvWords);
		map.put("TV", tvWords);
		map.put("XV", xvWords);
		map.put("AW", awWords);
		map.put("DW", dwWords);
		map.put("EW", ewWords);
		map.put("IW", iwWords);
		map.put("KW", kwWords);
		map.put("OW", owWords);
		map.put("RW", rwWords);
		map.put("SW", swWords);
		map.put("TW", twWords);
		map.put("UW", uwWords);
		map.put("XW", xwWords);
		map.put("YW", ywWords);
		map.put("RX", rxWords);
		map.put("CY", cyWords);
		map.put("DY", dyWords);
		map.put("HY", hyWords);
		map.put("KY", kyWords);
		map.put("LY", lyWords);
		map.put("PY", pyWords);
		map.put("RY", ryWords);
		map.put("SY", syWords);
		map.put("TY", tyWords);
		map.put("VY", vyWords);
		map.put("XY", xyWords);
		map.put("CZ", czWords);
		map.put("DZ", dzWords);
		map.put("GZ", gzWords);
		map.put("JZ", jzWords);
		map.put("SZ", szWords);
		map.put("TZ", tzWords);

		return map;

	}

	public static Set<String> coupleLettersProvider() {
		Set<String> coupleLetterSet = new HashSet<>();
		coupleLetterSet.add("WA");
		coupleLetterSet.add("CB");
		coupleLetterSet.add("DB");
		coupleLetterSet.add("GB");
		coupleLetterSet.add("HB");
		coupleLetterSet.add("YB");
		coupleLetterSet.add("ZB");
		coupleLetterSet.add("DC");
		coupleLetterSet.add("GC");
		coupleLetterSet.add("JC");
		coupleLetterSet.add("KC");
		coupleLetterSet.add("MC");
		coupleLetterSet.add("YC");
		coupleLetterSet.add("CD");
		coupleLetterSet.add("GD");
		coupleLetterSet.add("MD");
		coupleLetterSet.add("PD");
		coupleLetterSet.add("TD");
		coupleLetterSet.add("ZD");
		coupleLetterSet.add("WE");
		coupleLetterSet.add("BF");
		coupleLetterSet.add("CF");
		coupleLetterSet.add("GF");
		coupleLetterSet.add("TF");
		coupleLetterSet.add("XF");
		coupleLetterSet.add("ZF");
		coupleLetterSet.add("BG");
		coupleLetterSet.add("FG");
		coupleLetterSet.add("KG");
		coupleLetterSet.add("TG");
		coupleLetterSet.add("DH");
		coupleLetterSet.add("FH");
		coupleLetterSet.add("GH");
		coupleLetterSet.add("TH");
		coupleLetterSet.add("WH");
		coupleLetterSet.add("ZH");
		coupleLetterSet.add("KJ");
		coupleLetterSet.add("MJ");
		coupleLetterSet.add("SJ");
		coupleLetterSet.add("DK");
		coupleLetterSet.add("EK");
		coupleLetterSet.add("FK");
		coupleLetterSet.add("GK");
		coupleLetterSet.add("HK");
		coupleLetterSet.add("LK");
		coupleLetterSet.add("NK");
		coupleLetterSet.add("RK");
		coupleLetterSet.add("SK");
		coupleLetterSet.add("UK");
		coupleLetterSet.add("DL");
		coupleLetterSet.add("HL");
		coupleLetterSet.add("JL");
		coupleLetterSet.add("KL");
		coupleLetterSet.add("ML");
		coupleLetterSet.add("VL");
		coupleLetterSet.add("XL");
		coupleLetterSet.add("YL");
		coupleLetterSet.add("ZL");
		coupleLetterSet.add("BM");
		coupleLetterSet.add("CM");
		coupleLetterSet.add("HM");
		coupleLetterSet.add("KM");
		coupleLetterSet.add("XM");
		coupleLetterSet.add("YM");
		coupleLetterSet.add("BN");
		coupleLetterSet.add("DN");
		coupleLetterSet.add("HN");
		coupleLetterSet.add("KN");
		coupleLetterSet.add("PN");
		coupleLetterSet.add("WN");
		coupleLetterSet.add("YN");
		coupleLetterSet.add("S�");
		coupleLetterSet.add("WO");
		coupleLetterSet.add("BP");
		coupleLetterSet.add("CP");
		coupleLetterSet.add("HP");
		coupleLetterSet.add("NP");
		coupleLetterSet.add("YP");
		coupleLetterSet.add("ZP");
		coupleLetterSet.add("CQ");
		coupleLetterSet.add("DQ");
		coupleLetterSet.add("MQ");
		coupleLetterSet.add("XQ");
		coupleLetterSet.add("HR");
		coupleLetterSet.add("KR");
		coupleLetterSet.add("LR");
		coupleLetterSet.add("VR");
		coupleLetterSet.add("WR");
		coupleLetterSet.add("YR");
		coupleLetterSet.add("ZR");
		coupleLetterSet.add("CS");
		coupleLetterSet.add("DS");
		coupleLetterSet.add("FS");
		coupleLetterSet.add("GS");
		coupleLetterSet.add("HS");
		coupleLetterSet.add("KS");
		coupleLetterSet.add("MS");
		coupleLetterSet.add("TS");
		coupleLetterSet.add("WS");
		coupleLetterSet.add("ZS");
		coupleLetterSet.add("GT");
		coupleLetterSet.add("HT");
		coupleLetterSet.add("MT");
		coupleLetterSet.add("WT");
		coupleLetterSet.add("YT");
		coupleLetterSet.add("ZT");
		coupleLetterSet.add("KU");
		coupleLetterSet.add("BV");
		coupleLetterSet.add("MV");
		coupleLetterSet.add("TV");
		coupleLetterSet.add("XV");
		coupleLetterSet.add("AW");
		coupleLetterSet.add("DW");
		coupleLetterSet.add("EW");
		coupleLetterSet.add("IW");
		coupleLetterSet.add("KW");
		coupleLetterSet.add("OW");
		coupleLetterSet.add("RW");
		coupleLetterSet.add("SW");
		coupleLetterSet.add("TW");
		coupleLetterSet.add("UW");
		coupleLetterSet.add("XW");
		coupleLetterSet.add("YW");
		coupleLetterSet.add("RX");
		coupleLetterSet.add("CY");
		coupleLetterSet.add("DY");
		coupleLetterSet.add("HY");
		coupleLetterSet.add("KY");
		coupleLetterSet.add("LY");
		coupleLetterSet.add("PY");
		coupleLetterSet.add("RY");
		coupleLetterSet.add("SY");
		coupleLetterSet.add("TY");
		coupleLetterSet.add("VY");
		coupleLetterSet.add("XY");
		coupleLetterSet.add("CZ");
		coupleLetterSet.add("DZ");
		coupleLetterSet.add("GZ");
		coupleLetterSet.add("JZ");
		coupleLetterSet.add("SZ");
		coupleLetterSet.add("TZ");

		return coupleLetterSet;
	}

}
