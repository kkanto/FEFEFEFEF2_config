 
listView('FEFEFEFEF2 Jobs') {
    description('FEFEFEFEF2 Jobs')
    jobs {
        regex('FEFEFEFEF2_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
