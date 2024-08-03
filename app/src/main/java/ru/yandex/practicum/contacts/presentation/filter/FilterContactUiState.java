package ru.yandex.practicum.contacts.presentation.filter;

import java.util.Collections;
import java.util.Set;

import ru.yandex.practicum.contacts.model.ContactType;

public class FilterContactUiState {
    public boolean isApplyEnable() {
        return ApplyEnable;
    }

    public void setApplyEnable(boolean applyEnable) {
        ApplyEnable = applyEnable;
    }

    private boolean ApplyEnable = false;

    public Set<ContactType> getNewSelectedContactTypes() {
        return newSelectedContactTypes;
    }

    public void setNewSelectedContactTypes(Set<ContactType> newSelectedContactTypes) {
        this.newSelectedContactTypes = newSelectedContactTypes;
    }

    private Set<ContactType> newSelectedContactTypes = Collections.emptySet();
}
