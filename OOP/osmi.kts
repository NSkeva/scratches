enum class DAYS {

    PONEDELJAK,
    UTORAK,
    SRIJEDA,
    CETVRTAK,
    PETAK,
    SUBOTA,
    NEDELJA
}

    for (day in DAYS.values()) {
        println("${day.ordinal} = ${day.name}")
    }
    println("${DAYS.valueOf(" SRIJEDA ")}")
