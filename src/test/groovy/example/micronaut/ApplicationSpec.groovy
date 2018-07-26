package example.micronaut

import io.micronaut.context.ApplicationContext
import io.micronaut.runtime.server.EmbeddedServer
import spock.lang.AutoCleanup
import spock.lang.Specification


class ApplicationSpec extends Specification {

    @AutoCleanup
    EmbeddedServer server

    def "application starts"() {
        when:
        server = ApplicationContext.run(EmbeddedServer.class)

        then:
        server.port
    }
}
