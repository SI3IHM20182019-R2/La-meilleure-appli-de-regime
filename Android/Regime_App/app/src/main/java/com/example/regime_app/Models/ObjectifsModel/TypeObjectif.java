package com.example.regime_app.Models.ObjectifsModel;

import com.example.regime_app.R;

public enum TypeObjectif {
    PerteDePoids ("Perte de poids", R.drawable.perte_de_poids, R.layout.perte_poids, "Vous pouvez réussir à perdre quelques kilos à deux conditions : changer vos habitudes alimentaires et augmenter votre activité physique. Si vous ne pratiquez aujourd'hui aucun exercice physique, il ne s'agit pas obligatoirement de faire du sport, mais une marche quotidienne ou un peu de natation chaque semaine peuvent déjà faire beaucoup.", "Vous pouvez réussir à perdre quelques kilos à deux conditions : changer vos habitudes alimentaires et augmenter votre activité physique. Si vous ne pratiquez aujourd'hui aucun exercice physique, il ne s'agit pas obligatoirement de faire du sport, mais une marche quotidienne ou un peu de natation chaque semaine peuvent déjà faire beaucoup."),
    PriseDeMuscle ("Prise de muscle", R.drawable.prise_de_muscle, R.layout.prise_muscle, "C’est facile de s’inscrire à la salle de sport, mais être plus musclé et prendre de la masse requiert davantage d’efforts ! Beaucoup de paramètres sont à prendre en considération et l’on en apprend tous les jours, même après des années de pratique. Il existe également beaucoup de mythes autour de la musculation, difficiles à déconstruire, ce qui ne facilite pas la tâche.", "C’est facile de s’inscrire à la salle de sport, mais être plus musclé et prendre de la masse requiert davantage d’efforts ! Beaucoup de paramètres sont à prendre en considération et l’on en apprend tous les jours, même après des années de pratique. Il existe également beaucoup de mythes autour de la musculation, difficiles à déconstruire, ce qui ne facilite pas la tâche."),
    ReduireGlucides ("Réduire les glucides", R.drawable.reduire_les_glucides, R.layout.reduire_glucides, "Lorsque le sucre entre dans le sang, il provoque une élévation du taux de sucre sanguin, ou pic de glycémie. L’amplitude de ce pic pouvant être plus ou moins grande, elle est mesurée par un indice, que l’on appelle index glycémique (ou IG) :", "Lorsque le sucre entre dans le sang, il provoque une élévation du taux de sucre sanguin, ou pic de glycémie. L’amplitude de ce pic pouvant être plus ou moins grande, elle est mesurée par un indice, que l’on appelle index glycémique (ou IG) :"),
    PerteGraisse ("Perte de graisse localisé", R.drawable.perte_de_graisse_localise, R.layout.perte_gaisse, "Lorsque le sucre entre dans le sang, il provoque une élévation du taux de sucre sanguin, ou pic de glycémie. L’amplitude de ce pic pouvant être plus ou moins grande, elle est mesurée par un indice, que l’on appelle index glycémique (ou IG) :", "Lorsque le sucre entre dans le sang, il provoque une élévation du taux de sucre sanguin, ou pic de glycémie. L’amplitude de ce pic pouvant être plus ou moins grande, elle est mesurée par un indice, que l’on appelle index glycémique (ou IG) :"),
    MangerSain ("Manger plus sain", R.drawable.manger_plus_sain, R.layout.manger_sain, "Lorsque le sucre entre dans le sang, il provoque une élévation du taux de sucre sanguin, ou pic de glycémie. L’amplitude de ce pic pouvant être plus ou moins grande, elle est mesurée par un indice, que l’on appelle index glycémique (ou IG) :", "Lorsque le sucre entre dans le sang, il provoque une élévation du taux de sucre sanguin, ou pic de glycémie. L’amplitude de ce pic pouvant être plus ou moins grande, elle est mesurée par un indice, que l’on appelle index glycémique (ou IG) :"),
    AmeliorationSilhouette ("Amélioration silhouette", R.drawable.amelioration_silhouette, R.layout.amelioration_silhouette, "Lorsque le sucre entre dans le sang, il provoque une élévation du taux de sucre sanguin, ou pic de glycémie. L’amplitude de ce pic pouvant être plus ou moins grande, elle est mesurée par un indice, que l’on appelle index glycémique (ou IG) :", "Lorsque le sucre entre dans le sang, il provoque une élévation du taux de sucre sanguin, ou pic de glycémie. L’amplitude de ce pic pouvant être plus ou moins grande, elle est mesurée par un indice, que l’on appelle index glycémique (ou IG) :");

    private String text;
    private int idLayout;
    private int idImage;
    private String but;
    private String conseilCoach;

    TypeObjectif(String text, int idImage, int idLayout, String but, String conseilCoach){
        this.text = text;
        this.idLayout = idLayout;
        this.idImage = idImage;
        this.but = but;
        this.conseilCoach = conseilCoach;
    }

    public String getText(){
        return this.text;
    }

    public int getIdLayout() {
        return this.idLayout;
    }

    public int getImage() { return this.idImage; }

    public String getBut() { return this.but; }

    public String getConseilCoach() { return this.conseilCoach; }
}
