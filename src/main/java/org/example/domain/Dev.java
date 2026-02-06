package org.example.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> completedContents =  new LinkedHashSet<Content>();
    private Set<Content>  subscribedContents =  new LinkedHashSet<Content>();

    public void subscribeToBootcamp(Bootcamp bootcamp){
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevs().add(this);
    }

    public void progress(){
        Optional<Content> content = this.subscribedContents.stream().findFirst();
        if(content.isPresent()){
            this.completedContents.add(content.get());
            this.subscribedContents.remove(content.get());
        }
        else {
            System.err.println("You are not subscribed to any content.");
        }
        }

    public double calculateTotalExp(){

        return this.completedContents.stream().mapToDouble(Content::calculateExp).sum();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    public Set<Content> getSubscribedContents() {
        return subscribedContents;
    }



    public void setSubscribedContents(Set<Content> subscribedContents) {
        this.subscribedContents = subscribedContents;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
