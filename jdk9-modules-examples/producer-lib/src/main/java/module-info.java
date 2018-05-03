import kcs.pres.modules.producer.api.Producer;
import kcs.pres.modules.producer.impl.ProducerImpl;

module kcs.pres.modules.producerlibrary {
    requires spring.context;

    exports kcs.pres.modules.producer.api to kcs.pres.modules.consumerservice;
    provides Producer with ProducerImpl;
}