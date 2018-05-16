import kcs.demo.modules.producer.api.Producer;
import kcs.demo.modules.producer.impl.ProducerImpl;

module kcs.pres.modules.producerlibrary {
    requires spring.context;

    exports kcs.demo.modules.producer.api to kcs.demo.modules.consumerservice;
    provides Producer with ProducerImpl;
}