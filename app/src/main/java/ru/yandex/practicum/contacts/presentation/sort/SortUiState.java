package ru.yandex.practicum.contacts.presentation.sort;

class SortUiState {
    private boolean isApplyEnable = false;
    private String newSelectedSortType = null;

    public boolean getApplyEnable() {
        return isApplyEnable;
    }

    public void setApplyEnable(boolean value) {
        isApplyEnable = value;
    }

    public String getSelectedSortType() {
        return newSelectedSortType;
    }

    public void setSelectedSortType(String value) {
        newSelectedSortType = value;
    }
}
