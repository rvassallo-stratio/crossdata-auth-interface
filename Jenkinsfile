@Library('libpipelines@master') _

hose {
    EMAIL = 'crossdata'
    MODULE = 'crossdata-auth'
    DEVTIMEOUT = 20
    RELEASETIMEOUT = 20
    FOSS = true
    REPOSITORY = 'crossdata-auth-interface'
    
    DEV = { config ->
        doDeploy(config)            
    }
}
