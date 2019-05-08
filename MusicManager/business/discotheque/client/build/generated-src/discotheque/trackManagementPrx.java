//
// Copyright (c) ZeroC, Inc. All rights reserved.
//
//
// Ice version 3.7.2
//
// <auto-generated>
//
// Generated from file `Discotheque.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package discotheque;

public interface trackManagementPrx extends com.zeroc.Ice.ObjectPrx
{
    default void ajouterTitre(Morceau song)
    {
        ajouterTitre(song, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void ajouterTitre(Morceau song, java.util.Map<String, String> context)
    {
        _iceI_ajouterTitreAsync(song, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> ajouterTitreAsync(Morceau song)
    {
        return _iceI_ajouterTitreAsync(song, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> ajouterTitreAsync(Morceau song, java.util.Map<String, String> context)
    {
        return _iceI_ajouterTitreAsync(song, context, false);
    }

    /**
     * @hidden
     * @param iceP_song -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_ajouterTitreAsync(Morceau iceP_song, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "ajouterTitre", null, sync, null);
        f.invoke(false, context, null, ostr -> {
                     Morceau.ice_write(ostr, iceP_song);
                 }, null);
        return f;
    }

    default Morceau[] recupererTitres()
    {
        return recupererTitres(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Morceau[] recupererTitres(java.util.Map<String, String> context)
    {
        return _iceI_recupererTitresAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> recupererTitresAsync()
    {
        return _iceI_recupererTitresAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> recupererTitresAsync(java.util.Map<String, String> context)
    {
        return _iceI_recupererTitresAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Morceau[]> _iceI_recupererTitresAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Morceau[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "recupererTitres", null, sync, null);
        f.invoke(true, context, null, null, istr -> {
                     Morceau[] ret;
                     ret = MorceauxHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default Morceau[] rechercher(String info)
    {
        return rechercher(info, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Morceau[] rechercher(String info, java.util.Map<String, String> context)
    {
        return _iceI_rechercherAsync(info, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherAsync(String info)
    {
        return _iceI_rechercherAsync(info, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherAsync(String info, java.util.Map<String, String> context)
    {
        return _iceI_rechercherAsync(info, context, false);
    }

    /**
     * @hidden
     * @param iceP_info -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Morceau[]> _iceI_rechercherAsync(String iceP_info, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Morceau[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "rechercher", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_info);
                 }, istr -> {
                     Morceau[] ret;
                     ret = MorceauxHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default Morceau[] rechercherParTitre(String title)
    {
        return rechercherParTitre(title, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Morceau[] rechercherParTitre(String title, java.util.Map<String, String> context)
    {
        return _iceI_rechercherParTitreAsync(title, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherParTitreAsync(String title)
    {
        return _iceI_rechercherParTitreAsync(title, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherParTitreAsync(String title, java.util.Map<String, String> context)
    {
        return _iceI_rechercherParTitreAsync(title, context, false);
    }

    /**
     * @hidden
     * @param iceP_title -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Morceau[]> _iceI_rechercherParTitreAsync(String iceP_title, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Morceau[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "rechercherParTitre", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_title);
                 }, istr -> {
                     Morceau[] ret;
                     ret = MorceauxHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default Morceau[] rechercherParArtiste(String artist)
    {
        return rechercherParArtiste(artist, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Morceau[] rechercherParArtiste(String artist, java.util.Map<String, String> context)
    {
        return _iceI_rechercherParArtisteAsync(artist, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherParArtisteAsync(String artist)
    {
        return _iceI_rechercherParArtisteAsync(artist, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherParArtisteAsync(String artist, java.util.Map<String, String> context)
    {
        return _iceI_rechercherParArtisteAsync(artist, context, false);
    }

    /**
     * @hidden
     * @param iceP_artist -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Morceau[]> _iceI_rechercherParArtisteAsync(String iceP_artist, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Morceau[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "rechercherParArtiste", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_artist);
                 }, istr -> {
                     Morceau[] ret;
                     ret = MorceauxHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default Morceau[] rechercherParAlbum(String album)
    {
        return rechercherParAlbum(album, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Morceau[] rechercherParAlbum(String album, java.util.Map<String, String> context)
    {
        return _iceI_rechercherParAlbumAsync(album, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherParAlbumAsync(String album)
    {
        return _iceI_rechercherParAlbumAsync(album, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherParAlbumAsync(String album, java.util.Map<String, String> context)
    {
        return _iceI_rechercherParAlbumAsync(album, context, false);
    }

    /**
     * @hidden
     * @param iceP_album -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Morceau[]> _iceI_rechercherParAlbumAsync(String iceP_album, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Morceau[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "rechercherParAlbum", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_album);
                 }, istr -> {
                     Morceau[] ret;
                     ret = MorceauxHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default Morceau[] rechercherParGenre(String genre)
    {
        return rechercherParGenre(genre, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Morceau[] rechercherParGenre(String genre, java.util.Map<String, String> context)
    {
        return _iceI_rechercherParGenreAsync(genre, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherParGenreAsync(String genre)
    {
        return _iceI_rechercherParGenreAsync(genre, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherParGenreAsync(String genre, java.util.Map<String, String> context)
    {
        return _iceI_rechercherParGenreAsync(genre, context, false);
    }

    /**
     * @hidden
     * @param iceP_genre -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Morceau[]> _iceI_rechercherParGenreAsync(String iceP_genre, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Morceau[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "rechercherParGenre", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_genre);
                 }, istr -> {
                     Morceau[] ret;
                     ret = MorceauxHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default Morceau[] rechercherParDuree(String duration)
    {
        return rechercherParDuree(duration, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default Morceau[] rechercherParDuree(String duration, java.util.Map<String, String> context)
    {
        return _iceI_rechercherParDureeAsync(duration, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherParDureeAsync(String duration)
    {
        return _iceI_rechercherParDureeAsync(duration, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Morceau[]> rechercherParDureeAsync(String duration, java.util.Map<String, String> context)
    {
        return _iceI_rechercherParDureeAsync(duration, context, false);
    }

    /**
     * @hidden
     * @param iceP_duration -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Morceau[]> _iceI_rechercherParDureeAsync(String iceP_duration, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Morceau[]> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "rechercherParDuree", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_duration);
                 }, istr -> {
                     Morceau[] ret;
                     ret = MorceauxHelper.read(istr);
                     return ret;
                 });
        return f;
    }

    default boolean supprimerTitre(String title, String artist)
    {
        return supprimerTitre(title, artist, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default boolean supprimerTitre(String title, String artist, java.util.Map<String, String> context)
    {
        return _iceI_supprimerTitreAsync(title, artist, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> supprimerTitreAsync(String title, String artist)
    {
        return _iceI_supprimerTitreAsync(title, artist, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> supprimerTitreAsync(String title, String artist, java.util.Map<String, String> context)
    {
        return _iceI_supprimerTitreAsync(title, artist, context, false);
    }

    /**
     * @hidden
     * @param iceP_title -
     * @param iceP_artist -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_supprimerTitreAsync(String iceP_title, String iceP_artist, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "supprimerTitre", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_title);
                     ostr.writeString(iceP_artist);
                 }, istr -> {
                     boolean ret;
                     ret = istr.readBool();
                     return ret;
                 });
        return f;
    }

    default boolean supprimerAlbum(String artist, String album)
    {
        return supprimerAlbum(artist, album, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default boolean supprimerAlbum(String artist, String album, java.util.Map<String, String> context)
    {
        return _iceI_supprimerAlbumAsync(artist, album, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> supprimerAlbumAsync(String artist, String album)
    {
        return _iceI_supprimerAlbumAsync(artist, album, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> supprimerAlbumAsync(String artist, String album, java.util.Map<String, String> context)
    {
        return _iceI_supprimerAlbumAsync(artist, album, context, false);
    }

    /**
     * @hidden
     * @param iceP_artist -
     * @param iceP_album -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_supprimerAlbumAsync(String iceP_artist, String iceP_album, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "supprimerAlbum", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_artist);
                     ostr.writeString(iceP_album);
                 }, istr -> {
                     boolean ret;
                     ret = istr.readBool();
                     return ret;
                 });
        return f;
    }

    default boolean supprimerArtiste(String artist)
    {
        return supprimerArtiste(artist, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default boolean supprimerArtiste(String artist, java.util.Map<String, String> context)
    {
        return _iceI_supprimerArtisteAsync(artist, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> supprimerArtisteAsync(String artist)
    {
        return _iceI_supprimerArtisteAsync(artist, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.Boolean> supprimerArtisteAsync(String artist, java.util.Map<String, String> context)
    {
        return _iceI_supprimerArtisteAsync(artist, context, false);
    }

    /**
     * @hidden
     * @param iceP_artist -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> _iceI_supprimerArtisteAsync(String iceP_artist, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.Boolean> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "supprimerArtiste", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     ostr.writeString(iceP_artist);
                 }, istr -> {
                     boolean ret;
                     ret = istr.readBool();
                     return ret;
                 });
        return f;
    }

    default String jouerMorceaux(Morceau[] morceaux, int port)
    {
        return jouerMorceaux(morceaux, port, com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default String jouerMorceaux(Morceau[] morceaux, int port, java.util.Map<String, String> context)
    {
        return _iceI_jouerMorceauxAsync(morceaux, port, context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<java.lang.String> jouerMorceauxAsync(Morceau[] morceaux, int port)
    {
        return _iceI_jouerMorceauxAsync(morceaux, port, com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<java.lang.String> jouerMorceauxAsync(Morceau[] morceaux, int port, java.util.Map<String, String> context)
    {
        return _iceI_jouerMorceauxAsync(morceaux, port, context, false);
    }

    /**
     * @hidden
     * @param iceP_morceaux -
     * @param iceP_port -
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<java.lang.String> _iceI_jouerMorceauxAsync(Morceau[] iceP_morceaux, int iceP_port, java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<java.lang.String> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "jouerMorceaux", null, sync, null);
        f.invoke(true, context, null, ostr -> {
                     MorceauxHelper.write(ostr, iceP_morceaux);
                     ostr.writeInt(iceP_port);
                 }, istr -> {
                     String ret;
                     ret = istr.readString();
                     return ret;
                 });
        return f;
    }

    default void playPause()
    {
        playPause(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void playPause(java.util.Map<String, String> context)
    {
        _iceI_playPauseAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> playPauseAsync()
    {
        return _iceI_playPauseAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> playPauseAsync(java.util.Map<String, String> context)
    {
        return _iceI_playPauseAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_playPauseAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "playPause", null, sync, null);
        f.invoke(false, context, null, null, null);
        return f;
    }

    default void nextTrack()
    {
        nextTrack(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void nextTrack(java.util.Map<String, String> context)
    {
        _iceI_nextTrackAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> nextTrackAsync()
    {
        return _iceI_nextTrackAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> nextTrackAsync(java.util.Map<String, String> context)
    {
        return _iceI_nextTrackAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_nextTrackAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "nextTrack", null, sync, null);
        f.invoke(false, context, null, null, null);
        return f;
    }

    default void previousTrack()
    {
        previousTrack(com.zeroc.Ice.ObjectPrx.noExplicitContext);
    }

    default void previousTrack(java.util.Map<String, String> context)
    {
        _iceI_previousTrackAsync(context, true).waitForResponse();
    }

    default java.util.concurrent.CompletableFuture<Void> previousTrackAsync()
    {
        return _iceI_previousTrackAsync(com.zeroc.Ice.ObjectPrx.noExplicitContext, false);
    }

    default java.util.concurrent.CompletableFuture<Void> previousTrackAsync(java.util.Map<String, String> context)
    {
        return _iceI_previousTrackAsync(context, false);
    }

    /**
     * @hidden
     * @param context -
     * @param sync -
     * @return -
     **/
    default com.zeroc.IceInternal.OutgoingAsync<Void> _iceI_previousTrackAsync(java.util.Map<String, String> context, boolean sync)
    {
        com.zeroc.IceInternal.OutgoingAsync<Void> f = new com.zeroc.IceInternal.OutgoingAsync<>(this, "previousTrack", null, sync, null);
        f.invoke(false, context, null, null, null);
        return f;
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static trackManagementPrx checkedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, ice_staticId(), trackManagementPrx.class, _trackManagementPrxI.class);
    }

    /**
     * Contacts the remote server to verify that the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static trackManagementPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, context, ice_staticId(), trackManagementPrx.class, _trackManagementPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static trackManagementPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, ice_staticId(), trackManagementPrx.class, _trackManagementPrxI.class);
    }

    /**
     * Contacts the remote server to verify that a facet of the object implements this type.
     * Raises a local exception if a communication error occurs.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @param context The Context map to send with the invocation.
     * @return A proxy for this type, or null if the object does not support this type.
     **/
    static trackManagementPrx checkedCast(com.zeroc.Ice.ObjectPrx obj, String facet, java.util.Map<String, String> context)
    {
        return com.zeroc.Ice.ObjectPrx._checkedCast(obj, facet, context, ice_staticId(), trackManagementPrx.class, _trackManagementPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @return A proxy for this type.
     **/
    static trackManagementPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, trackManagementPrx.class, _trackManagementPrxI.class);
    }

    /**
     * Downcasts the given proxy to this type without contacting the remote server.
     * @param obj The untyped proxy.
     * @param facet The name of the desired facet.
     * @return A proxy for this type.
     **/
    static trackManagementPrx uncheckedCast(com.zeroc.Ice.ObjectPrx obj, String facet)
    {
        return com.zeroc.Ice.ObjectPrx._uncheckedCast(obj, facet, trackManagementPrx.class, _trackManagementPrxI.class);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the per-proxy context.
     * @param newContext The context for the new proxy.
     * @return A proxy with the specified per-proxy context.
     **/
    @Override
    default trackManagementPrx ice_context(java.util.Map<String, String> newContext)
    {
        return (trackManagementPrx)_ice_context(newContext);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the adapter ID.
     * @param newAdapterId The adapter ID for the new proxy.
     * @return A proxy with the specified adapter ID.
     **/
    @Override
    default trackManagementPrx ice_adapterId(String newAdapterId)
    {
        return (trackManagementPrx)_ice_adapterId(newAdapterId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoints.
     * @param newEndpoints The endpoints for the new proxy.
     * @return A proxy with the specified endpoints.
     **/
    @Override
    default trackManagementPrx ice_endpoints(com.zeroc.Ice.Endpoint[] newEndpoints)
    {
        return (trackManagementPrx)_ice_endpoints(newEndpoints);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator cache timeout.
     * @param newTimeout The new locator cache timeout (in seconds).
     * @return A proxy with the specified locator cache timeout.
     **/
    @Override
    default trackManagementPrx ice_locatorCacheTimeout(int newTimeout)
    {
        return (trackManagementPrx)_ice_locatorCacheTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the invocation timeout.
     * @param newTimeout The new invocation timeout (in seconds).
     * @return A proxy with the specified invocation timeout.
     **/
    @Override
    default trackManagementPrx ice_invocationTimeout(int newTimeout)
    {
        return (trackManagementPrx)_ice_invocationTimeout(newTimeout);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for connection caching.
     * @param newCache <code>true</code> if the new proxy should cache connections; <code>false</code> otherwise.
     * @return A proxy with the specified caching policy.
     **/
    @Override
    default trackManagementPrx ice_connectionCached(boolean newCache)
    {
        return (trackManagementPrx)_ice_connectionCached(newCache);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the endpoint selection policy.
     * @param newType The new endpoint selection policy.
     * @return A proxy with the specified endpoint selection policy.
     **/
    @Override
    default trackManagementPrx ice_endpointSelection(com.zeroc.Ice.EndpointSelectionType newType)
    {
        return (trackManagementPrx)_ice_endpointSelection(newType);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for how it selects endpoints.
     * @param b If <code>b</code> is <code>true</code>, only endpoints that use a secure transport are
     * used by the new proxy. If <code>b</code> is false, the returned proxy uses both secure and
     * insecure endpoints.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default trackManagementPrx ice_secure(boolean b)
    {
        return (trackManagementPrx)_ice_secure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the encoding used to marshal parameters.
     * @param e The encoding version to use to marshal request parameters.
     * @return A proxy with the specified encoding version.
     **/
    @Override
    default trackManagementPrx ice_encodingVersion(com.zeroc.Ice.EncodingVersion e)
    {
        return (trackManagementPrx)_ice_encodingVersion(e);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its endpoint selection policy.
     * @param b If <code>b</code> is <code>true</code>, the new proxy will use secure endpoints for invocations
     * and only use insecure endpoints if an invocation cannot be made via secure endpoints. If <code>b</code> is
     * <code>false</code>, the proxy prefers insecure endpoints to secure ones.
     * @return A proxy with the specified selection policy.
     **/
    @Override
    default trackManagementPrx ice_preferSecure(boolean b)
    {
        return (trackManagementPrx)_ice_preferSecure(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the router.
     * @param router The router for the new proxy.
     * @return A proxy with the specified router.
     **/
    @Override
    default trackManagementPrx ice_router(com.zeroc.Ice.RouterPrx router)
    {
        return (trackManagementPrx)_ice_router(router);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for the locator.
     * @param locator The locator for the new proxy.
     * @return A proxy with the specified locator.
     **/
    @Override
    default trackManagementPrx ice_locator(com.zeroc.Ice.LocatorPrx locator)
    {
        return (trackManagementPrx)_ice_locator(locator);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for collocation optimization.
     * @param b <code>true</code> if the new proxy enables collocation optimization; <code>false</code> otherwise.
     * @return A proxy with the specified collocation optimization.
     **/
    @Override
    default trackManagementPrx ice_collocationOptimized(boolean b)
    {
        return (trackManagementPrx)_ice_collocationOptimized(b);
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses twoway invocations.
     * @return A proxy that uses twoway invocations.
     **/
    @Override
    default trackManagementPrx ice_twoway()
    {
        return (trackManagementPrx)_ice_twoway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses oneway invocations.
     * @return A proxy that uses oneway invocations.
     **/
    @Override
    default trackManagementPrx ice_oneway()
    {
        return (trackManagementPrx)_ice_oneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch oneway invocations.
     * @return A proxy that uses batch oneway invocations.
     **/
    @Override
    default trackManagementPrx ice_batchOneway()
    {
        return (trackManagementPrx)_ice_batchOneway();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses datagram invocations.
     * @return A proxy that uses datagram invocations.
     **/
    @Override
    default trackManagementPrx ice_datagram()
    {
        return (trackManagementPrx)_ice_datagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, but uses batch datagram invocations.
     * @return A proxy that uses batch datagram invocations.
     **/
    @Override
    default trackManagementPrx ice_batchDatagram()
    {
        return (trackManagementPrx)_ice_batchDatagram();
    }

    /**
     * Returns a proxy that is identical to this proxy, except for compression.
     * @param co <code>true</code> enables compression for the new proxy; <code>false</code> disables compression.
     * @return A proxy with the specified compression setting.
     **/
    @Override
    default trackManagementPrx ice_compress(boolean co)
    {
        return (trackManagementPrx)_ice_compress(co);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection timeout setting.
     * @param t The connection timeout for the proxy in milliseconds.
     * @return A proxy with the specified timeout.
     **/
    @Override
    default trackManagementPrx ice_timeout(int t)
    {
        return (trackManagementPrx)_ice_timeout(t);
    }

    /**
     * Returns a proxy that is identical to this proxy, except for its connection ID.
     * @param connectionId The connection ID for the new proxy. An empty string removes the connection ID.
     * @return A proxy with the specified connection ID.
     **/
    @Override
    default trackManagementPrx ice_connectionId(String connectionId)
    {
        return (trackManagementPrx)_ice_connectionId(connectionId);
    }

    /**
     * Returns a proxy that is identical to this proxy, except it's a fixed proxy bound
     * the given connection.@param connection The fixed proxy connection.
     * @return A fixed proxy bound to the given connection.
     **/
    @Override
    default trackManagementPrx ice_fixed(com.zeroc.Ice.Connection connection)
    {
        return (trackManagementPrx)_ice_fixed(connection);
    }

    static String ice_staticId()
    {
        return "::discotheque::trackManagement";
    }
}
