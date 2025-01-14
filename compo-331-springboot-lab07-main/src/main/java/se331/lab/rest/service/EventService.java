package se331.lab.rest.service;

import org.springframework.data.domain.Page;
import se331.lab.rest.entity.Event;

public interface EventService {
    Integer getEventSize();
    Page<Event> getEvents(Integer pageSize, Integer page);
    Event getEventById(Long id);
    Event saveEvent(Event event);
}
