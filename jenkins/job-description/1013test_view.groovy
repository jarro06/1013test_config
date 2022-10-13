 
listView('1013test Jobs') {
    description('1013test Jobs')
    jobs {
        regex('1013test_.+')
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
