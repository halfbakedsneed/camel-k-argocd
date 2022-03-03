from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Brownbag!!!" }
    .to("log:info")
