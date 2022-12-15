package com.example.cycleviewcriticalrole;

public class MyData
{
    static String[] characterNames = {"Vax'ildan", "Vex'ahlia", "Percy", "Scanlan", "Grog", "Keyleth", "Pike", "Tiberius"};
    static String[] characterClass = {"Half Elf Rogue", "Half Elf Ranger", "Human Fighter", "Gnome Bard",
                                      "Goliath Barbarian", "Half Elf Druid", "Gnome Cleric", "Dragonborn Sorcerer"};
    static Integer[] characterDrawableIDs = {R.drawable.vax, R.drawable.vex, R.drawable.percy, R.drawable.scanlan,
                                             R.drawable.grog, R.drawable.keyleth, R.drawable.pike, R.drawable.tiberius};
    static Integer[] characterBigDrawableIDs = {R.drawable.vaxbig, R.drawable.vexbig, R.drawable.percybig, R.drawable.scanlanbig,
            R.drawable.grogbig, R.drawable.keylethbig, R.drawable.pikebig, R.drawable.tiberiusbig};
    static String[] characterInfos = {"Vax'ildan, nicknamed Vax, is a half-elf rogue / paladin / druid and a member of Vox Machina. He is played by Liam O'Brien.\n" +
            "\n" +
            "Born in Byroden, he and his twin sister Vex'ahlia were raised there by their mother Elaina until they were taken to live in the elven city of Syngorn at the direction of their father, Syldor Vessar. He and Vex'ahlia were unhappy, and left in their early adulthood to be on their own.\n" +
            "\n" +
            "During his adventures with Vox Machina, he came into possession of the legendary Deathwalker's Ward and Whisper to fight the Chroma Conclave. Vax'ildan offered his life in service to The Raven Queen to save his sister, and after his own death, was brought back to life by her to defeat Vecna. He then abandoned his mortal form to become Champion of the Raven Queen.",
            "Vex'ahlia, nicknamed Vex, is a half-elf ranger / rogue member of Vox Machina. She is played by Laura Bailey.\n" +
            "Born in Byroden, she and her twin brother Vax'ildan were raised there by their mother Elaina until they were taken to live in the elven city of Syngorn at the direction of their father, Syldor Vessar. She and Vax'ildan were unhappy, and left in their early adulthood to be on their own. In their travels, Vax'ahlia rescued a bear cub, Trinket, gaining a loyal animal companion.\n" +
            "\n" +
            "During her adventures with Vox Machina, she became the wielder of the legendary bow Fenthras to fight against the Chroma Conclave and earned the blessing of Pelor, becoming the Champion of Pelor, to face Vecna. After her marriage with Percival de Rolo she took his surname and became 'Lady Vex'ahlia de Rolo'. In later years, she became a member of the Tal'Dorei Council and had five children.",
            "Percival Fredrickstein von Musel Klossowski de Rolo III, often known simply as Percival de Rolo or Percy, is a human gunslinger member of Vox Machina and the father of firearms in the world of Exandria. He is played by Taliesin Jaffe.\n" +
            "\n" +
            "Percy's family once ruled the city of Whitestone, but when he was young, they were overthrown and murdered by the Briarwoods, Anna Ripley and their allies. Percy fled, his hair turning white from the trauma, and he wandered aimlessly for several years. He was eventually visited in dreams by the shadow demon Orthax who gave him the knowledge to build the very first firearm in existence, The List.\n" +
            "\n" +
            "During his travels with Vox Machina, Percy reunited with his sister Cassandra and took back Whitestone. He acquired the magical cape Cabal's Ruin to aid in the fight against the Chroma Conclave and helped carve the Prime Trammels with knowledge from Ioun to take down Vecna. He married Vex'ahlia, and the two of them settled in Whitestone where they had five children. His invention of firearms revolutionized warfare throughout Tal'Dorei and eventually all of Exandria.",
            "Scanlan Shorthalt is a gnome bard member of the group Vox Machina. He is played by Sam Riegel.\n" +
            "Scanlan spent a portion of his life travelling with Dr. Dranzel's Spectacular Traveling Troupe to support his single mother, Juniper. During his years of travel, he encountered a gnome named Sybil, who later gave birth to his daughter, Kaylie, without his knowledge. At one point, he witnessed his mother's death at the hands of a goblin.\n" +
            "\n" +
            "During his adventures with Vox Machina, Scanlan came into possession of the legendary sword, Mythcarver, to fight the Chroma Conclave. After meeting his daughter and going through hard times, Scanlan left Vox Machina. He later returned and earned the blessing of Ioun, becoming the Champion of Ioun, to face Vecna.",
            "Grog Strongjaw is a goliath barbarian/fighter and a member of Vox Machina. He is played by Travis Willingham.\n" +
            "\n" +
            "When he was young, Grog was exiled from the Herd of Storms by its leader, Grog's uncle Kevdak, for taking pity on a helpless old gnome the tribe was attacking. He was then taken in by that same gnome, Wilhand Trickfoot, and raised alongside his great-great-granddaughter Pike.\n" +
            "\n" +
            "During his adventures with Vox Machina, he became the wielder of the legendary Titanstone Knuckles, acquired by taking down his uncle, to fight against the Chroma Conclave. He forged the Prime Trammels and was the wielder of the Sword of Kas in the fight against Vecna.",
            "Keyleth (pronounced /ˈkiːlɪθ/) is a half-elf druid member of Vox Machina. She is played by Marisha Ray.\n" +
            "\n" +
            "Keyleth was raised in Zephrah as a member of the Air Ashari tribe. When she was a child, her mother Vilya left on a journey to earn the title of headmaster of the tribe, but never came back. After reaching adulthood, Keyleth left her home to attempt the Aramenté herself.\n" +
            "\n" +
            "During her adventures with Vox Machina, she became the wielder of a legendary staff, the Spire of Conflux, to fight against the Chroma Conclave. She completed her Aramenté and became the headmaster of the Air Ashari, a position that grants her the title Voice of the Tempest, adding several thousand years to her lifespan.",
            "Pike Trickfoot is a gnome cleric of Sarenrae and a member of Vox Machina. She is played by Ashley Johnson.\n" +
            "Pike was raised in the city of Westruun by her great-great-grandfather Wilhand Trickfoot, who had redeemed their family of thieves by becoming a follower of Sarenrae. She joined Vox Machina to help them find her missing friend Grog. During a fight, Pike's body was cut in half, and after her resurrection her black hair turned to white.\n" +
            "\n" +
            "During her time with Vox Machina, Pike acquired the Plate of the Dawnmartyr to aid in the fight against the Chroma Conclave. She spent some time away from the group to aid in the reconstruction of a new temple of Sarenrae in Vasselheim and the fortification of Whitestone. Pike also performed many successful resurrections of members of Vox Machina.",
            "Tiberius Stormwind was a dragonborn sorcerer and a former member of Vox Machina. He was played by Orion Acaba."
    };
}
