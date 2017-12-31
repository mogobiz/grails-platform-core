grails.doc.title = "Grails Platform Core"
grails.doc.subtitle = "Provides the Platform Core APIs and Tags"
grails.doc.images = new File("resources/img")
grails.doc.authors = "Marc Palmer (marc@grailsrocks.com), Stéphane Maldini (smaldini@vmware.com)"
grails.doc.license = "ASL 2"
grails.doc.copyright = "&copy; 2011-2013 Marc Palmer &amp; Stéphane Maldini"
grails.doc.footer = "Please contact the authors with any corrections or suggestions"

dataSource {
    pooled = true
    driverClassName = 'org.h2.Driver'
    username = 'sa'
    password = ''
    dbCreate = 'update'
    url = 'jdbc:h2:mem:testDb'
}

hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.provider_class = 'org.hibernate.cache.EhCacheProvider'
}
