
class Subscriptions {
    private int id, subscriber_id, channel_id;
    public Subscriptions() {
        System.out.println("subscriptions constructor invoked");
    }
    public Subscriptions(int id, int subscriber_id, int channel_id) {
        this.id = id;
        this.subscriber_id = subscriber_id;
        this.channel_id = channel_id;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSubscriber_id() {
        return subscriber_id;
    }
    public void setSubscriber_id(int subscriber_id) {
        this.subscriber_id = subscriber_id;
    }
    public int getChannel_id() {
        return channel_id;
    }
    public void setChannel_id(int channel_id) {
        this.channel_id = channel_id;
    }

    
}