package aleapp.myapplication

data class Biografia(var id : Int, val foto : String, val name :  String, val biografia : String)

fun getBiografias() : ArrayList<Biografia> {
    var bios = ArrayList<Biografia>()
    bios.add(Biografia( 1,  "ada_lovelace",  "Ada Lovelace",  "Augusta Ada King (née Byron), Countess of Lovelace (1815–1852) was famous in her day simply for being the daughter of the Romantic poet Lord Byron. \n\nIn the twentieth century, however, the source of her renown shifted from her family background to her own achievements.  Interested in mathematics and science from an early age, Lovelace studied the former on a largely self-motivated basis, but with occasional assistance from many of the scientific and mathematical figures of her day, including Charles Babbage (1791–1871) and Mary Somerville (1780–1872).  Lovelace’s acquaintance with Babbage began when she was still a teenager, when she also came into contact with his ideas for the construction of what would have been, in essence, a steam-powered computer.  As one of the few people who understood the potential of Babbage’s machine, Lovelace went on to write a series of notes on its possible operation, and is thus hailed as an early pioneer of computer science."))
    bios.add(Biografia( 2,  "charles_babbage",  "Charles Babbage",  "Charles Babbage, (born December 26, 1791, London, England—died October 18, 1871, London), English mathematician and inventor who is credited with having conceived the first automatic digital computer.\n\nIn 1812 Babbage helped found the Analytical Society, whose object was to introduce developments from the European continent into English mathematics. In 1816 he was elected a fellow of the Royal Society of London. He was instrumental in founding the Royal Astronomical (1820) and Statistical (1834) societies."))
    bios.add(Biografia( 3,  "john_neumann",  "John von Neumann",  "John von Neumann, (born December 28, 1903, Budapest, Hungary—died February 8, 1957, Washington, D.C., U.S.), Hungarian-born American mathematician. As an adult, he appended von to his surname; the hereditary title had been granted his father in 1913. Von Neumann grew from child prodigy to one of the world’s foremost mathematicians by his mid-twenties. Important work in set theory inaugurated a career that touched nearly every major branch of mathematics. Von Neumann’s gift for applied mathematics took his work in directions that influenced quantum theory, automata theory, economics, and defense planning. Von Neumann pioneered game theory and, along with Alan Turing and Claude Shannon, was one of the conceptual inventors of the stored-program digital computer."))
    return bios
}