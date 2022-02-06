from("timer:tick")
    .process { e -> e.getIn().body = "Hello Camel K Change!" }
    .to("log:info")
